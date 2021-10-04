package com.example.HomeWork.service.impl;

import com.example.HomeWork.exception.ResourceNotFoundException;
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
        return cityRepository.findById(id).orElseThrow( () -> new ResourceNotFoundException("Country", "id", id));
    }

    @Override
    public City update(City city, long id) {
        City existingCity = cityRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("City", "id", id));
        existingCity.setName(city.getName());
        cityRepository.save(existingCity);
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
