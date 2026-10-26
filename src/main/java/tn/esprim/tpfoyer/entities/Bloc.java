package tn.esprim.tpfoyer.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;

    private String nomBloc;

    private long capaciteBloc;

    @ManyToOne
    private Foyer foyer;
    @JsonIgnore

    @OneToMany(mappedBy = "bloc")
    private Set<Chambre> chambres;
}