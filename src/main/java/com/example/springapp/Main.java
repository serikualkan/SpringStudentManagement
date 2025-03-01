package com.example.springapp;

import com.example.springapp.config.AppConfig;
import com.example.springapp.service.StudentService;
import com.example.springapp.singleton.EagerBean;
import com.example.springapp.singleton.LazyBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        context.getBean(EagerBean.class);

        LazyBean lazyBean = context.getBean(LazyBean.class);

        StudentService studentService = context.getBean(StudentService.class);
        studentService.registerStudent(1, "Serik");
        System.out.println("Fetched Student: " + studentService.fetchStudent(1));

        context.close();
    }
}
