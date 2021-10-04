package com.example.HomeWork.repository;

import com.example.HomeWork.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
