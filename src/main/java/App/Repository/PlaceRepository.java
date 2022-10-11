package App.Repository;

import App.Model.Comment;
import App.Model.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlaceRepository extends JpaRepository<Place, Integer> {
    //@Query("FROM Place where")
    //public List<Place> getAllPlaces();
}