package com.example.HomeWork.service.impl;

import com.example.HomeWork.model.Country;
import com.example.HomeWork.repository.CountryRepository;
import com.example.HomeWork.service.CountryService;
import org.springframework.stereotype.Service;

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

}
