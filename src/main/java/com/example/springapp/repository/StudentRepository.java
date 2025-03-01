package com.example.springapp.repository;

import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {
    private final Map<Integer, String> studentDatabase = new HashMap<>();

    public void saveStudent(int id, String name) {
        studentDatabase.put(id, name);
    }

    public String getStudent(int id) {
        return studentDatabase.getOrDefault(id, "Student Not Found");
    }
}
