package com.example.contry_servies_controll_beans.beans;

public class Country {

    String countryName;
    String countryCapital;
    int countryID;

    public Country(int countryID, String countryName, String countryCapital) {
        this.countryID = countryID;
        this.countryName = countryName;
        this.countryCapital = countryCapital;
    }


    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCapital() {
        return countryCapital;
    }

    public void setCountryCapital(String countryCapital) {
        this.countryCapital = countryCapital;
    }



}
