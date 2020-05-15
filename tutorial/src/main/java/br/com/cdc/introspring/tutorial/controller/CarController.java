package br.com.cdc.introspring.tutorial.controller;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cdc.introspring.tutorial.beans.Car;
import br.com.cdc.introspring.tutorial.repository.CarRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CarController {
	
	private CarRepository repository;
	
	public CarController(CarRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/cars")
	public Collection<Car> cars(){
		return repository.findAll().stream()
				.filter(this::isCool)
				.collect(Collectors.toList());
	}
	
	private boolean isCool(Car car) {
        return !car.getNome().equals("AMC Gremlin") &&
                !car.getNome().equals("Triumph Stag") &&
                !car.getNome().equals("Ford Pinto") &&
                !car.getNome().equals("Yugo GV");
    }

}
