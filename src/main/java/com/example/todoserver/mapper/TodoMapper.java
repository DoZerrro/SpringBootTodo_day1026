package com.example.todoserver.mapper;

import com.example.todoserver.domain.Todo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TodoMapper {
    String getTime();

    List<Todo> todoList();

    Integer todoInput(Todo todo);

}
