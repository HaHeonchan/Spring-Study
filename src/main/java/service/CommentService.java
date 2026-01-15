package service;

import model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import proxy.CommenPushNotificationProxy;
import proxy.CommentNotificationProxy;
import repository.CommentRepository;

@Service
public class CommentService {
    private final CommentNotificationProxy commentNotificationProxy;
    private final CommentRepository commentRepository;

    public CommentService(
            CommentRepository commentRepository,
            @Qualifier("PUSH") CommenPushNotificationProxy commentNotificationProxy
            ) {
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
