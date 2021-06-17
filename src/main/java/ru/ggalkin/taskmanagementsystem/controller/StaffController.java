package ru.ggalkin.taskmanagementsystem.controller;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import ru.ggalkin.taskmanagementsystem.dao.StaffDao;
import ru.ggalkin.taskmanagementsystem.model.Staff;

@Controller
public class StaffController {

    private static String UPLOADED_FOLDER =

            "/Users/gavriilgalkin/IdeaProjects/Projects/TaskManagementSystem/src/main/webapp/WebContent/images/";


    @Autowired
    StaffDao staffDao;

    @RequestMapping("/staff")
    public String getStaffRegistrationForm() {

        return "staff";
    }

    @RequestMapping("/registration")
    public String singleFileUpload(@RequestParam("file") MultipartFile file,
                                   Staff staff )
            throws Exception{


        staff.setStaff_fio(staff.getStaff_surname() + " " + staff.getStaff_name() + " " + staff.getStaff_secondName());
          String filePath = UPLOADED_FOLDER + file.getOriginalFilename();

             staff.setPicture(file.getOriginalFilename());
             staffDao.save(staff);


        byte[] bytes = file.getBytes();
        Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
        Files.write(path, bytes);


        return "registration";
    }

    @GetMapping("/allstaff")
    public String getAllStaff(Model model) {

        List<Staff> staffs  = new ArrayList<>();
        staffs  = staffDao.findAll();

        for(Staff s : staffs) {
            System.out.println(s);
        }
        model.addAttribute("staffs",staffs);
        return "allstaff";
    }


    @GetMapping("/staff/{id}")
    public String getStaffDeials(Model model, @PathVariable("id") int id) {
        Staff staff = staffDao.getOne(id);
        model.addAttribute("staff", staff);
        return "staffdetails";
    }

}

