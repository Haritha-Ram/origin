package com.org.cts.service;

import com.org.cts.model.Student;
import com.org.cts.repostitory.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public void create(Student student){
        studentRepo.save(student);
    }

    public void update(Student student){
        studentRepo.save(student);
    }


    public void deleteById(Integer id){
        studentRepo.deleteById(id);
    }


    public List<Student> getAll(){
        return studentRepo.findAll();
    }
}
