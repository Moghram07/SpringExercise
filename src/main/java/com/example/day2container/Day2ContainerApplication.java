package com.example.day2container;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.validation.annotation.Validated;

@SpringBootApplication
public class Day2ContainerApplication {

    public static void main(String[] args) {

        SpringApplication.run(Day2ContainerApplication.class, args);

    }

    @Bean
    @Qualifier("1")
    public String getMessage1(MainController controller){
        System.out.println("hey from message1");
        return "1";
    }

    @Bean
    @Qualifier("2")
    public String getMessage2(){
        System.out.println("hey from message2");
        return "2";
    }

    @Bean
    @Qualifier("3")
    public String getMessage3(@Qualifier("1")String data){
        System.out.println("hey from message3");
        return data;
    }




}
