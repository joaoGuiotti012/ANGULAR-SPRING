package br.com.cdc.introspring.tutorial;

import br.com.cdc.introspring.tutorial.repository.CarRepository;
import br.com.cdc.introspring.tutorial.beans.Car;


import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.stream.Stream;

@SpringBootApplication
public class TutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialApplication.class, args);
	}
	
	@Bean
    ApplicationRunner init(CarRepository repository) {
		return args -> {
            Stream.of("Ferrari", "Jaguar", "Porsche", "Lamborghini", "Bugatti",
                      "AMC Gremlin", "Triumph Stag", "Ford Punto", "Yugo GV").forEach(nome -> {
        	  Car car = new Car();
              car.setNome(nome);
              repository.save(car);
            });
            //repository.findAll().forEach(System.out::println);
           
        };
    }
}



