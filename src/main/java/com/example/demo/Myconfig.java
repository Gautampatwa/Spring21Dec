package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
public class Myconfig {


    @Bean
    public Employee getEmployee()
    {
        System.out.println("Creating Employee object");
        return  new Employee();
    }
}
