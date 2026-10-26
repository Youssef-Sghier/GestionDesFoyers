package tn.esprim.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprim.tpfoyer.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, String> {
}