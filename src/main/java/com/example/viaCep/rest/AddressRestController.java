/**
 * 
 */
package com.example.viaCep.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.viaCep.model.AddressEntity;
import com.example.viaCep.repository.AddressRepository;

/**
 * @author Jayme
 *
 */

@RestController
@RequestMapping(value = "/api/adresses/zip")
public class AddressRestController {
	
	@Autowired
	AddressRepository repository;
	
	@GetMapping(value = "/{zip}", produces = "application/json;charset=UTF-8")
	public AddressEntity getAdress(@PathVariable String zip) {
		
		return repository.findByZip(zip);
		
	}

}
