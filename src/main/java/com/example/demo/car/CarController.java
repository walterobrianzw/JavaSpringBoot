package com.example.demo.car;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/car")
public class CarController {
    private final CarService carService;

    @Autowired
    CarController(CarService carService){
        this.carService=carService;

    }

    @GetMapping
	public List<String> getCars(){
        return carService.getCars();
	}
    
}
