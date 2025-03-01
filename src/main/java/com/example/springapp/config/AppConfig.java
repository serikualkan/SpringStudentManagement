package com.example.springapp.config;

import com.example.springapp.service.StudentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.example.springapp")
public class AppConfig {

    @Bean
    public StudentService studentService(@Qualifier("alternativeStudentService") StudentService service) {
        return service;
    }
}
