package com.example.demo.car;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class CarService {

    public List<String> getCars(){
		return List.of(
			new Car(
				"Honda","Fit",LocalDate.of(2000,01,01)
				,"Japan",60).toString()//,
			// new Car("Toyota","Hilux",LocalDate.of(2000,01,01),"Japan",40)
		);
	}
    
}
