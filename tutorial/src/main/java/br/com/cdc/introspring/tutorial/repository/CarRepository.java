package br.com.cdc.introspring.tutorial.repository;

import br.com.cdc.introspring.tutorial.beans.Car; // Class Car

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, Long>{
	

}
