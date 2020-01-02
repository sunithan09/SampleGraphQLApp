package com.sample.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentsApp
{
    public static void main (String[] args)
    {
        SpringApplication app = new SpringApplication(StudentsApp.class);
        app.run(args);
    }
}
