package App.Model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data //LOMBOK: data introduces automatic getter/setters
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Place {
    @Id //SPRING ORM: primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column //SPRING ORM
    int id;
    @Column
    String title;
    @OneToMany(mappedBy = "place")
    @JsonManagedReference
    List<Comment> comments;
}
