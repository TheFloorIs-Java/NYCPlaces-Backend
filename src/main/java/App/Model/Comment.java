package App.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data //LOMBOK: data introduces automatic getter/setters
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Comment {
    @Id //SPRING ORM: primary key
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column
    String comment;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="place_id")
    Place place;
}
