package org.openfootie.soccerapi.admin.repository;

import org.openfootie.soccerapi.admin.domain.Country;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CountryMockRepository {

    private Map<String, Country> countries = new HashMap<>();

    public Country add(Country country) {
        return countries.put(country.getName(), country);
    }
}
