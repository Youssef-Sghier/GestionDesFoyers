package tn.esprim.tpfoyer.services;

import tn.esprim.tpfoyer.entities.Foyer;

import java.util.List;

public interface IFoyerService {

    List<Foyer> retrieveAllFoyers();

    Foyer retrieveFoyer(Long foyerId);

    Foyer addFoyer(Foyer f);

    void removeFoyer(Long foyerId);

    Foyer modifyFoyer(Foyer foyer);
}