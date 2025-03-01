package com.example.springapp.singleton;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazySingletonBean {
    public LazySingletonBean() {
        System.out.println("LazySingletonBean initialized lazily");
    }
}
