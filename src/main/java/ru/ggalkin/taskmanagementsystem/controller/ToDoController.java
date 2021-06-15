package ru.ggalkin.taskmanagementsystem.controller;


import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ru.ggalkin.taskmanagementsystem.dao.StaffDao;
import ru.ggalkin.taskmanagementsystem.dao.TaskDao;
import ru.ggalkin.taskmanagementsystem.model.Staff;
import ru.ggalkin.taskmanagementsystem.model.Task;
import ru.ggalkin.taskmanagementsystem.service.EmailService;

@Controller
public class ToDoController {


    @Autowired
    TaskDao taskDao;

    @Autowired
    StaffDao staffDao;

    @Autowired
    EmailService emailService;


    @RequestMapping("/")
    public String getHomePage(Model model) {

         System.out.println(Paths.get("").toAbsolutePath().toString());

        Period intervalPeriod;

        List<Task> tasks = taskDao.findAll();


        Map<Period, Task> duration = new HashMap<>();

        for(Task t : tasks) {
            intervalPeriod = Period.between(t.getDue_date(), LocalDate.now());
            duration.put(intervalPeriod, t);

        }

        model.addAttribute("tasks",duration);
        return "main";
    }


    @GetMapping("/task")
    public String getTask() {
        return "task";
    }

    @PostMapping("/addTask")
    public String addTask(Model model, Task task) {

        Staff staff = staffDao.findOneStaff(task.getEmail());
        task.setStaff(staff);

        String staffFio = staffDao.findOneStaff(task.getEmail()).getStaff_fio();
        task.setStaffFio(staffFio);
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = new Date(1212121212121L);

        task.setCreated_date(LocalDate.now());
        task.setDue_date(LocalDate.of( 0001,  01,  01));

        taskDao.save(task);

//        emailService.sendSimpleMessage("mahetot@gmail.com", "Test", "Sending email");

        Period intervalPeriod;

        List<Task> tasks = taskDao.findAll();
        Map<Period, Task> duration = new HashMap<>();

        for(Task t : tasks) {
            intervalPeriod = Period.between(t.getDue_date(), LocalDate.now());
            duration.put(intervalPeriod, t);

        }

        model.addAttribute("tasks",duration);

        return "main";
    }


    @GetMapping("alltasks")
    public String getAllTasks(Model model) {

        Period intervalPeriod;

        List<Task> tasks = taskDao.findAll();

        Map<Period, Task> duration = new HashMap<>();

        for(Task t : tasks) {
            intervalPeriod = Period.between(t.getDue_date(), LocalDate.now());
            duration.put(intervalPeriod, t);

        }

        model.addAttribute("tasks",duration);
        return "alltasks";
    }


    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String getDelete(@PathVariable("id") int id, Model model) {
        taskDao.deleteById(id);

        List<Task> todos = new ArrayList<>();
        todos = taskDao.findAll();

        model.addAttribute("todos", todos);

        return "delete";
    }


    @GetMapping ("/update/{id}")
    public String getUpdate(@PathVariable("id") int id, Model model) {
        Task todo = taskDao.getOne(id);
        model.addAttribute("todo", todo);
        return "update";
    }

    @RequestMapping("/searchstaff")
    public String getStaffWithToDo() {
        return "searchstaff";
    }


    @PostMapping("/updateToDo/{id}")
    public String getUpdatedToDo(@PathVariable("id") int id, Task todo, Model model) {

        Task todos = taskDao.getOne(id);
        todos.setEmail(todo.getEmail());
        todos.setTask_descrption(todo.getTask_descrption());
        todos.setDue_date(todo.getDue_date());
        todos.setCreated_date(todo.getCreated_date());
        taskDao.save(todos);

        Period intervalPeriod;

        List<Task> tasks = taskDao.findAll();


        Map<Period, Task> duration = new HashMap<>();

        for(Task t : tasks) {
            intervalPeriod = Period.between(t.getDue_date(), LocalDate.now());
            duration.put(intervalPeriod, t);

        }

        model.addAttribute("tasks",duration);

        return "updateToDo";
    }

}
