package ru.ggalkin.taskmanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query; // указывает какой SQL запрос должен быть выполнен
import org.springframework.stereotype.Repository; //говорит о том, что это слой взаимодействия с БД

import ru.ggalkin.taskmanagementsystem.model.Staff;

@Repository
public interface StaffDao extends JpaRepository<Staff, Integer>{

    @Query("select u from Staff u where u.useremail = ?1")
    Staff findOneStaff(String email);


}
