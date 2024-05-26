package com.example.contry_servies_controll_beans.controller;

import com.example.contry_servies_controll_beans.beans.Country;
import com.example.contry_servies_controll_beans.servies.contryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountyController {
    @Autowired
    contryServices countyServices;
    @GetMapping("/getcountry")
    public List getCountry(){
        return countyServices.getAllCountries();
    }
    @GetMapping("/getcountry/{id}")
    public Country getCountryById(@PathVariable int id){
        return countyServices.getCountryById(id);
    }
    @GetMapping("/getcountry/countryname")
    public Country getCountryByCountryName(@RequestParam(value = "name") String countryName){
        return countyServices.getCountryByName(countryName);
    }
    @PostMapping("/addcountry")
    public Country addCountry(@RequestBody Country country){
        return countyServices.addCountry(country);
    }
    @PutMapping("/updatecountry")
    public Country updateCountry(@RequestBody Country country){
        return countyServices.updateCountry(country);
    }
    @DeleteMapping("/deletcountry/{id}")
    public Addrespons deleteCountry(@PathVariable(value = "id") int id){
        return countyServices.deleteCountry(id);
    }
}
