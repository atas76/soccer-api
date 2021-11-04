package org.openfootie.soccerapi.admin.service;

import org.openfootie.soccerapi.admin.domain.Country;
import org.openfootie.soccerapi.admin.repository.CountryMockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    private CountryMockRepository repository;

    @Autowired
    public CountryService(CountryMockRepository repository) {
        this.repository = repository;
    }

    public Country add(Country country) {
        return this.repository.add(country);
    }
}
