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
    public CommentController(CommentService cs) {
        this.cs = cs;
    }
    @GetMapping("comments")
    public List<Comment> getAllComments() {
        return cs.getAllComments();
    }

    /**
     * This function get Comments by Place
     * @param id place id
     * @return a list of comments
     */
    @GetMapping("comments/place/{id}")
    public List<Comment> getCommentsByPlace(@PathVariable int id) {return cs.getCommentsByPlace(id);}

    @PostMapping("comment/place/{id}")
    public Comment addComment(@PathVariable int id, @RequestBody Comment c) {
        return cs.addComment(id, c);
    }

//    @PostMapping("comment")
//    public Comment addComment(@RequestBody Comment c) {
//        return cs.addComment(c);
//    }

    @DeleteMapping("comment/{id}")
    public void deleteById(@PathVariable int id) {
        cs.deleteById(id);
    }
}