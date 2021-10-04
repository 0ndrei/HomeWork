package com.example.HomeWork.service;

import com.example.HomeWork.model.City;

import java.util.List;

public interface CityService {
    City save(City country);
    List<City> getAll();
    City get(long id);
    City update(City City, long id);
    void delete(long id);
}