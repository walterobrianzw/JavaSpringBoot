package com.example.demo.car;

import java.time.LocalDate;

public class Car {
    private String make;
    private String model;
    private LocalDate yearOfManufacture;
    private String country;
    private Integer consumptionInLitres;

    public Car(
        String make,
        String model,
        LocalDate yearOfManufacture,
        String country,
        Integer consumptionInLitres
    ){

        this.make=make;
        this.model =model;
        this.yearOfManufacture = yearOfManufacture;
        this.country = country;
        this.consumptionInLitres =consumptionInLitres;

    }
    @Override
    public String toString(){
        return "Car{"+"make="+make+"model="+model
        +"yearOfManufacture="+ yearOfManufacture+
        "country=" + country+
        "consumptionInLitres="+Integer.toString(consumptionInLitres);
    }
}
