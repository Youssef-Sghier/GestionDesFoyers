package tn.esprim.tpfoyer.services;

import tn.esprim.tpfoyer.entities.Bloc;

import java.util.List;

public interface IBlocService {

    List<Bloc> retrieveAllBlocs();

    Bloc retrieveBloc(Long blocId);

    Bloc addBloc(Bloc b);

    void removeBloc(Long blocId);

    Bloc modifyBloc(Bloc bloc);
}