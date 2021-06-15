package ru.ggalkin.taskmanagementsystem.model;

import java.util.List;

import javax.persistence.Column; //используется для указания сведений о столбце, с которым связано поле или свойство.
import javax.persistence.Entity; //говорит Hibernate о том, что этот класс является сущностью
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue; //позволяет задать несколько различных способов генерации этого идентификатора
import javax.persistence.Id; //указывает на то поле, которое является уникальным идентификатором сущности
import javax.persistence.JoinColumn; //указывает имя внешнего ключа в БД, по которому происходит связь с родительской сущностью
import javax.persistence.JoinTable; //аннотация используется для указания таблицы связей между двумя другими таблицами базы данных
import javax.persistence.ManyToMany; //задают связь между сущностями, что позволяет легко манипулировать всеми связанными сущностями в рамках вызова одного метода.
import org.springframework.context.annotation.Scope; //задает то, как Spring будет создавать ваши бины
import javax.persistence.GenerationType;


@Entity
@Scope("session")
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String todo;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "CustomerTodos", joinColumns =
    @JoinColumn(name = "EmployeeId", referencedColumnName = "id"),
            inverseJoinColumns =
            @JoinColumn(name = "ToDoId", referencedColumnName = "id"))
    private List<EmployeeToDo> employeeToDo;


    public List<EmployeeToDo> getEmployeeToDo() {
        return employeeToDo;
    }

    public void setEmployeeToDo(List<EmployeeToDo> employeeToDo) {
        this.employeeToDo = employeeToDo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    @Override
    public String toString() {
        return "ToDo [id=" + id + ", toDo=" + todo + "]";
    }


}
