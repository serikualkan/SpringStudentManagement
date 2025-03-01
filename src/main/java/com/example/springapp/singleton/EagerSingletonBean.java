package com.example.springapp.singleton;

import org.springframework.stereotype.Component;

@Component
public class EagerSingletonBean {
    public EagerSingletonBean() {
        System.out.println("EagerSingletonBean initialized eagerly");
    }
}
