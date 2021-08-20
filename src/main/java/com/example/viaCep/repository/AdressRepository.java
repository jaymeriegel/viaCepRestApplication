/**
 * 
 */
package com.example.viaCep.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.viaCep.model.AdressEntity;

/**
 * @author Jayme
 *
 */
public interface AdressRepository extends CrudRepository<AdressEntity, Long> {
	
	AdressEntity findByZip(String zip);

}
