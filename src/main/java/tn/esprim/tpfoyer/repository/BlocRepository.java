package tn.esprim.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprim.tpfoyer.entities.Bloc;

public interface BlocRepository extends JpaRepository<Bloc, Integer> {
}