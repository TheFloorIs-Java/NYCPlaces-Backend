package App.Service;

import App.Model.Comment;
import App.Model.Place;
import App.Repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Component
@Transactional
public class CommentService {
    CommentRepository cr;
    PlaceService ps;

    @Autowired
    public CommentService(CommentRepository cr, PlaceService ps) {
        this.cr = cr;
        this.ps = ps;

    }

    public List<Comment> getAllComments() {
        return cr.findAll();
    }

    public Comment addComment(int placeId, Comment c) {
        Place p = ps.getPlaceById(placeId);
        c.setPlace(p);
        return cr.save(c);
    }

    public Comment addComment(Comment c) {
        return cr.save(c);
    }

    public void deleteById(int id) {
        cr.deleteById(id);
    }
    public List<Comment> getCommentsByPlace(int placeId){
        Place p = ps.getPlaceById(placeId);
        return p.getComments();
    }
}