package App.Controller;

import App.Model.Comment;
import App.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CommentController {
    CommentService cs;
    @Autowired
    public CommentController(CommentService cs){
        this.cs = cs;

    }
    @GetMapping("/comment")
    public List<Comment> getAllComments(){
        return cs.getAllComments();
    }
    @PostMapping("/comment")
    public Comment addComment(@RequestBody Comment c){
        return cs.addComment(c);
    }
}
