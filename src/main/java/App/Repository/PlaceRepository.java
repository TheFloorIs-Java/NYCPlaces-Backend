package App.Repository;

import App.Model.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlaceRepository extends JpaRepository<Place, Integer> {
    @Query("FROM Place")
    public List<Place> getAllPlaces();

    @Query("FROM Place where id= :id")
    public List<Place> getPlaceById(@Param("id") int id);

}