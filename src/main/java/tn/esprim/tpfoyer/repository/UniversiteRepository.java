package tn.esprim.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprim.tpfoyer.entities.Universite;

public interface UniversiteRepository extends JpaRepository<Universite, Long> {
}