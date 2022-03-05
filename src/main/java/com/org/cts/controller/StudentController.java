package com.org.cts.controller;

import com.org.cts.model.Student;
import com.org.cts.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @PostMapping("/create")
    public void create(@RequestBody Student student){
       studentService.create(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentService.update(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Integer id){
        studentService.deleteById(id);
    }

    @GetMapping("/getAll")
    public List<Student>getAll()
    {
       return studentService.getAll();
    }

}
