package tn.esprim.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprim.tpfoyer.entities.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
}