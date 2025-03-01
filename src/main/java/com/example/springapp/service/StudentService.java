package com.example.springapp.service;

public interface StudentService {
    void registerStudent(int id, String name);
    String fetchStudent(int id);
}
