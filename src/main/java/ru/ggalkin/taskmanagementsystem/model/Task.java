package ru.ggalkin.taskmanagementsystem.model;


import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Table; //позволяет указать название таблицы в БД, которая связана с этой сущностью
import javax.persistence.Column; //используется для указания сведений о столбце, с которым связано поле или свойство.
import javax.persistence.Entity; //говорит Hibernate о том, что этот класс является сущностью
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue; //позволяет задать несколько различных способов генерации этого идентификатора
import javax.persistence.Id; //указывает на то поле, которое является уникальным идентификатором сущности
import javax.persistence.JoinColumn; //указывает имя внешнего ключа в БД, по которому происходит связь с родительской сущностью
import javax.persistence.ManyToOne; // @OneToMany задаёт отношение «один-ко-многим» между страной и городом, т.е. в одной стране может быть несколько городов.
                                    // Поэтому такая аннотация всегда вешается на коллекцию (список). @ManyToOne является обратной по отношению к @OneToMany и располагается в дочерней сущности


@Entity
@Table(name = "Task")
public class Task {

    @Id
    @GeneratedValue
    private int id;

    @Column (name = "description")
    private String task_descrption;

    @Column (name = "project")
    private String task_project;

    @Column (name = "task")
    private String task_task;

    @Column (name = "due_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate due_date;

    @Column(name = "created_date")
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate created_date;

    @Column(name = "email")
    private String email;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "useremail", nullable = false)
    private Staff staff;

//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userefio", nullable = false)
    private String staffFio;

    public String getStaffFio() {
        return staffFio;
    }

    public void setStaffFio(String staffFio) {
        this.staffFio = staffFio;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {

        this.staff = staff;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Task() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask_descrption() {
        return task_descrption;
    }

    public void setTask_descrption(String task_descrption) {
        this.task_descrption = task_descrption;
    }

    public String getTask_project() {
        return task_project;
    }

    public void setTask_project(String task_project) {
        this.task_project = task_project;
    }

    public String getTask_task() {
        return task_task;
    }

    public void setTask_task(String task_task) {
        this.task_task = task_task;
    }

    public LocalDate getDue_date() {
        return due_date;
    }

    public void setDue_date(LocalDate due_date) {
        this.due_date = due_date;
    }

    public LocalDate getCreated_date() {
        return created_date;
    }

    public void setCreated_date(LocalDate created_date) {
        this.created_date = created_date;
    }

    @Override
    public String toString() {
        return "Task [id=" + id + ", task_descrption=" + task_descrption + ", task_project=" + task_project + ", task_task=" + task_task + ", due_date=" + due_date + ", created_date="
                + created_date +"]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((created_date == null) ? 0 : created_date.hashCode());
        result = prime * result + ((due_date == null) ? 0 : due_date.hashCode());
        result = prime * result + id;
        result = prime * result + ((task_descrption == null) ? 0 : task_descrption.hashCode());
        result = prime * result + ((task_project == null) ? 0 : task_project.hashCode());
        result = prime * result + ((task_task == null) ? 0 : task_task.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Task other = (Task) obj;
        if (created_date == null) {
            if (other.created_date != null)
                return false;
        } else if (!created_date.equals(other.created_date))
            return false;
        if (due_date == null) {
            if (other.due_date != null)
                return false;
        } else if (!due_date.equals(other.due_date))
            return false;
        if (id != other.id)
            return false;
        if (task_descrption == null) {
            if (other.task_descrption != null)
                return false;
        } else if (!task_descrption.equals(other.task_descrption))
            return false;
        if (task_project == null) {
            if (other.task_project != null)
                return false;
        } else if (!task_project.equals(other.task_project))
            return false;
        if (task_task == null) {
            if (other.task_task != null)
                return false;
        } else if (!task_task.equals(other.task_task))
            return false;
        return true;
    }


}
