package com.example.day2container;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MainController {
    String data;
    public MainController(@Qualifier("2") String data) {
        this.data = data;
        System.out.println("hey from Main controller");
    }
}
