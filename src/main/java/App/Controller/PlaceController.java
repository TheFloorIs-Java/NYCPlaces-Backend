package App.Controller;

import App.Model.Place;
import App.Service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PlaceController {
    PlaceService ps;

    @Autowired
    public PlaceController(PlaceService ps) {
        this.ps = ps;
    }

    @GetMapping("/place")
    public List<Place> getAllPlaces() {
        return ps.getAllPlaces();
    }

    @PostMapping("/place")
    public Place addPlace(@RequestBody Place p) {
        return ps.addPlace(p);
    }
    @DeleteMapping("place/{id}")
    public void deletePlaceById(@PathVariable int id) {
        ps.deletePlaceById(id);
    }
}

