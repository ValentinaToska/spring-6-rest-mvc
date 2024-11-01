package vali.springframework.spring6restmvc.services;

import org.springframework.stereotype.Service;
import vali.springframework.spring6restmvc.model.Beer;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface BeerService {

    List<Beer> listBeers();

    Optional<Beer> getBeerById(UUID id) ;

    Beer saveNewBeer(Beer beer);

    void updateBeerById(UUID beerId, Beer beer);

    void deleteBeerById(UUID beerId);

    void PatchBeerById(UUID beerId, Beer beer);
}
