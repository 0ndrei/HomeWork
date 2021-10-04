package com.example.HomeWork.service.impl;

import com.example.HomeWork.model.Country;
import com.example.HomeWork.repository.CountryRepository;
import com.example.HomeWork.service.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl  implements CountryService {
    CountryRepository countryRepository;

    public  CountryServiceImpl(CountryRepository countryRepository){
        super();
        this.countryRepository = countryRepository;
    }

    @Override
    public Country save(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public List<Country> getAll() {
        return countryRepository.findAll(); }

    @Override
    public Country get(long id) {
        return null;
    }

    @Override
    public Country updateCountry(Country country, long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
