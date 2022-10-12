package App.Service;

import App.Model.Place;
import App.Repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class PlaceService {
    PlaceRepository pr;

    @Autowired
    public PlaceService(PlaceRepository pr) {
        this.pr = pr;

    }

    public List<Place> getAllPlaces() {
        return pr.findAll();
    }

    public Place getPlaceById(int id) {
        return pr.findById(id).get();
    }

    public Place addPlace(Place p) {
        return pr.save(p);
    }

    public void deletePlaceById(int id) {
        pr.deleteById(id);
    }
}

