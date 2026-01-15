package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import repository.CommentRepository;

@Service
@Lazy
public class CommentService {
    public CommentService() {
        System.out.println("CommentService instance created");
    }
}
