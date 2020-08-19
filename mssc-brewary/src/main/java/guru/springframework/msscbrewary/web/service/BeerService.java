package guru.springframework.msscbrewary.web.service;

import guru.springframework.msscbrewary.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);
}
