package ru.ggalkin.taskmanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; //говорит о том, что это слой взаимодействия с БД

import ru.ggalkin.taskmanagementsystem.model.Task;

@Repository
public interface TaskDao extends JpaRepository<Task, Integer> {

}