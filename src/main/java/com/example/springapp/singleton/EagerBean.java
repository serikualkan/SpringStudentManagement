package com.example.springapp.singleton;

import org.springframework.stereotype.Component;

@Component
public class EagerBean {
    public EagerBean() {
        System.out.println("EagerSingletonBean initialized eagerly");
    }
}
