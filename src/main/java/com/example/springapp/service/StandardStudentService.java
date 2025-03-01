package com.example.springapp.service;

import com.example.springapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class StandardStudentService implements StudentService {
    private final StudentRepository repository;

    @Autowired
    public StandardStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void registerStudent(int id, String name) {
        repository.saveStudent(id, name);
        System.out.println("[Standard] Student Registered: " + name);
    }

    @Override
    public String fetchStudent(int id) {
        return repository.getStudent(id);
    }
}
