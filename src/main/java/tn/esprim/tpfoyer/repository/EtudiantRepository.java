package tn.esprim.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprim.tpfoyer.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}