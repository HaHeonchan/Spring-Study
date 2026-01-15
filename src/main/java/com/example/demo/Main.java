package com.example.demo;

import config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;
import service.UserService;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var cs1 = c.getBean(CommentService.class);
        var cs2 = c.getBean(UserService.class);

        boolean b = cs1.getCommentRepository() == cs2.getCommentRepository();

        System.out.println(b);
    }
}
