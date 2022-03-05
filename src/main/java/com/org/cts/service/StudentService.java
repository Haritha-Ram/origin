package com.org.cts.service;

import com.org.cts.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface StudentService {

    public void create(Student student);

    public void update(Student student);

    public void deleteById(Integer id);

    public List<Student> getAll();
}

