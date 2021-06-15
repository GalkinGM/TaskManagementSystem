package ru.ggalkin.taskmanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.ggalkin.taskmanagementsystem.model.EmployeeToDo;

public interface EmployeeToDoDao
        extends JpaRepository<EmployeeToDo, Integer>

{

}