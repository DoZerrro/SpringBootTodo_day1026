package com.example.todoserver.mapper;

import com.example.todoserver.domain.Todo;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Log4j2
@SpringBootTest
class TodoMapperTest {

    @Autowired
    private TodoMapper todoMapper;

    @Test
    void getTime() {
        String time = todoMapper.getTime();
        System.out.println("@@@@@@@@@@@@@@@@@2" + time);
    }

    @Test
    void todoList() {
        /**
         * todoList 확인
         */

        List<Todo> todoList = todoMapper.todoList();
        //todoList.forEach(todo -> System.out.println(todo));
        todoList.forEach(log::info);
    }

    @Test
    void todoInput() {
        Todo todo = Todo.builder()
                .title("title11")
                .memo("memo11")
                .build();
        int result = todoMapper.todoInput(todo);
        log.info(result);
    }
}