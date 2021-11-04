package org.openfootie.soccerapi.admin.web;

import org.openfootie.soccerapi.admin.domain.Country;
import org.openfootie.soccerapi.admin.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class CountryController {

    private CountryService service;

    @Autowired
    public CountryController(CountryService service) {
        this.service = service;
    }

    @PutMapping(value = "/admin/country")
    public ResponseEntity<?> insertCountry(@RequestBody Country country) throws Exception {
        boolean newElement = this.service.add(country) == null;
        if (newElement) {
            return ResponseEntity.created((new URI("/admin/country/" + country.getName()))).build();
        } else {
            return ResponseEntity.noContent().build();
        }
    }
}
