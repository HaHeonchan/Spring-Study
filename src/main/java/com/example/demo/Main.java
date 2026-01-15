package com.example.demo;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;
import service.UserService;

import java.nio.file.LinkOption;
import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = c.getBean(CommentService.class);
        Comment comment = new Comment();

        comment.setText("고라니 귀여워");
        comment.setAuther("고라니");

        String value = service.publishComment(comment);

        logger.info(value);

    }
}
