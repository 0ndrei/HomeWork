package com.example.HomeWork.service;

import com.example.HomeWork.model.Country;

import java.util.List;

public interface CountryService {
    Country save (Country country);
    List<Country> getAll();
    Country get(long id);
    Country updateCountry(Country country, long id);
    void delete(long id);
}
