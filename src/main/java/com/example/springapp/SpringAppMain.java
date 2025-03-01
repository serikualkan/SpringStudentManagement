package com.example.springapp;

import com.example.springapp.config.AppConfig;
import com.example.springapp.service.StudentService;
import com.example.springapp.singleton.EagerSingletonBean;
import com.example.springapp.singleton.LazySingletonBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        context.getBean(EagerSingletonBean.class);

        LazySingletonBean lazyBean = context.getBean(LazySingletonBean.class);

        StudentService studentService = context.getBean(StudentService.class);
        studentService.registerStudent(1, "Alice");
        System.out.println("Fetched Student: " + studentService.fetchStudent(1));

        context.close();
    }
}
