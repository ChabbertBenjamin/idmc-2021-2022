package fr.unilorraine.idmc.gamescatalog.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Games {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private Long price;
    private int rating;
    private String category;
    private Instant releaseDate;
    private Long publishedId;


}