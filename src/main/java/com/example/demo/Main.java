package com.example.demo;

import config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        System.out.println("befo commentservice");

        var service = c.getBean(CommentService.class);

        System.out.println("After rt Commentsercie");
    }
}
