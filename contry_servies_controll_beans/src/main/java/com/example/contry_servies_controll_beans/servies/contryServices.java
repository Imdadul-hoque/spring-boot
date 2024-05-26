package com.example.contry_servies_controll_beans.servies;

import com.example.contry_servies_controll_beans.beans.Country;
import com.example.contry_servies_controll_beans.controller.Addrespons;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Component
public class contryServices {
    static HashMap<Integer, Country> countryIDMap;

    public contryServices() {
        countryIDMap = new HashMap<Integer, Country>();
        Country bdCountry=new Country(1,"BD","Dhaka");
        Country usaCountry=new Country(13,"USA","washington");
        Country ukCountry=new Country(3,"UK","London");
        countryIDMap.put(1, bdCountry);
        countryIDMap.put(2, usaCountry);
        countryIDMap.put(3, ukCountry);

    }
    public List getAllCountries() {
        List countries = new ArrayList(countryIDMap.values());
        return countries;
    }
    public Country getCountryById(int id) {
        return countryIDMap.get(id);
    }
    public Country getCountryByName(String name) {
       Country country = null;
       for (int c : countryIDMap.keySet()) {
           if (countryIDMap.get(c).getCountryName().equals(name))
               country = countryIDMap.get(c);
       }
       return country;

    }
    public Country addCountry(Country country) {
       country.setCountryID(getMaxId());
        return countryIDMap.put(country.getCountryID(), country);
    }
    //Utility method to get max id
    public static int getMaxId(){
        int max =0;
        for (int id : countryIDMap.keySet()) {
            if (max<=id)
                max=id;
        }
        return max+1;
    }
    public Country updateCountry(Country country) {
        if (country.getCountryID()>0)
            countryIDMap.put(country.getCountryID(),country);
        return country;
    }
    public Addrespons deleteCountry(int id) {
        countryIDMap.remove(id);
        Addrespons res=new Addrespons();
        res.setMsg("Country Successfully deleted");
        res.setId(id);
        return res;
    }
}
