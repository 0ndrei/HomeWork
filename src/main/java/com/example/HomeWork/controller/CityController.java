package com.example.HomeWork.controller;

import com.example.HomeWork.model.City;
import com.example.HomeWork.service.CityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {
    private CityService cityService;

    public CityController(CityService cityService){
        super();
        this.cityService = cityService;
    }

    @PostMapping
    public ResponseEntity<City> create(@RequestBody City city){
        return new ResponseEntity<City>(cityService.save(city), HttpStatus.CREATED);
    }

    @GetMapping
    public List<City> get(){
        return cityService.getAll();
    }
}
