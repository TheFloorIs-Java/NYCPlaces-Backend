package App.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data //LOMBOK: data introduces automatic getter/setters
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Comment {
    @Id //SPRING ORM: primary key
    @GeneratedValue
    @Column //SPRING ORM
    int id;
    @Column
    String comment;
}
