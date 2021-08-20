package com.example.viaCep;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.viaCep.model.AdressEntity;
import com.example.viaCep.repository.AdressRepository;

@SpringBootApplication
public class ViaCepApplicationDuo2Application {

	public static void main(String[] args) {
		SpringApplication.run(ViaCepApplicationDuo2Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(AdressRepository repository) {
		return (args) -> {
			repository.save(new AdressEntity("123", "teste", "teste1", "teste2", "teste3", "teste4", "teste5", "teste6", 123, "teste8"));
		};
	}

}
