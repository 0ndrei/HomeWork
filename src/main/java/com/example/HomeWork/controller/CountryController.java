package com.example.HomeWork.controller;

import com.example.HomeWork.model.Country;
import com.example.HomeWork.service.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {
    private CountryService countryService;

    public CountryController(CountryService countryService){
        super();
        this.countryService = countryService;
    }
    @PostMapping
    public ResponseEntity<Country> create(@RequestBody Country country){
        return new ResponseEntity<Country>(countryService.save(country), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Country> get(){
        return countryService.getAll();
    }

}
