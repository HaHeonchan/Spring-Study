package com.example.demo;

import config.ProjectConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class); //스프링 컨텍스트의 인스턴스 생성

        var comment = new Comment();
        comment.setText("우웨에에");
        comment.setAuther("고라니");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
