package ru.ggalkin.taskmanagementsystem.dao;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query; // указывает какой SQL запрос должен быть выполнен
import org.springframework.stereotype.Repository; //говорит о том, что это слой взаимодействия с БД
import ru.ggalkin.taskmanagementsystem.model.ToDo;

@Repository
public interface TodoDao extends JpaRepository<ToDo, Integer> {

    @Query("select u from ToDo u")
    List<ToDo> findAllTodos();

    @Query("select u from ToDo u where u.id = 2")
    ToDo findOneToDo();

    @Query("select u from ToDo u order by u.id")
    List<ToDo> findToDosOrderById(Pageable pageable);

    @Query("select u from ToDo u where u.id = ?1")
    ToDo findTodobyId(int id);

}