package App.Repository;

import App.Model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    @Query("FROM Comment where id= :id")
    public List<Comment> getCommentById(@Param("id") int id);

    @Query("FROM Comment where year= (select max(year) from Comment)")
    public Comment getNewestComment();

}