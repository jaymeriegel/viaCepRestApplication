/**
 * 
 */
package com.example.viaCep.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.viaCep.model.AdressEntity;
import com.example.viaCep.repository.AdressRepository;

/**
 * @author Jayme
 *
 */

@RestController
@RequestMapping(value = "/api/adresses/zip")
public class AdressRestController {
	
	@Autowired
	AdressRepository repository;
	
	
	
	@GetMapping(value = "/{zip}", produces = "application/json;charset=UTF-8")
	public AdressEntity getAdress(@PathVariable String zip) {
		
		return repository.findByZip(zip);
		
	}

}
