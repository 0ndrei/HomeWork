package com.example.HomeWork.service.impl;

import com.example.HomeWork.model.City;
import com.example.HomeWork.repository.CityRepository;
import com.example.HomeWork.service.CityService;

import java.util.List;

public class CityServiceImpl implements CityService {
    CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository){
        super();
        this.cityRepository = cityRepository;
    }

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }

    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }

    @Override
    public City get(long id) {
        return null;
    }

    @Override
    public City update(City City, long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
