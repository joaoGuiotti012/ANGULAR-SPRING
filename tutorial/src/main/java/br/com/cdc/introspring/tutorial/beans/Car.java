package br.com.cdc.introspring.tutorial.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@Entity
@Data
@NoArgsConstructor
public class Car {
	@Id @GeneratedValue
	private Long id;
	private @NonNull String nome;
	
	public Car() {
		
	}
	
	public Car(Long id , String nome ) {
		this.id = id;
		this.nome = nome;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
