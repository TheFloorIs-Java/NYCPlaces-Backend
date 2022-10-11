package App.Service;

import App.Model.Comment;
import App.Repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommentService {
    CommentRepository cr;
    @Autowired
    public CommentService(CommentRepository cr){
        this.cr = cr;

    }
    public List<Comment> getAllComments(){
        return cr.findAll();
    }
    public Comment addComment(Comment c){
       return cr.save(c);
    }
}
