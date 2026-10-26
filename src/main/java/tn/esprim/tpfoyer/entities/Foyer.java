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
public class Foyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;

    private String nomFoyer;

    private long capaciteFoyer;

    @OneToOne
    private Universite universite;
    @JsonIgnore

    @OneToMany(mappedBy = "foyer")
    private Set<Bloc> blocs;
}