package com.richard.org.springbootmysqldocker.controller;

import com.richard.org.springbootmysqldocker.dao.StudentDAO;
import com.richard.org.springbootmysqldocker.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentDAO studentDAO;

    public StudentController(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @GetMapping("/findAll")
    public List<Student> getAllStudent(){
        return studentDAO.findAll();
    }

    @PostMapping("/insert")
    public Student getAllStudent(@RequestBody Student student){
        return studentDAO.save(student);
    }
}
