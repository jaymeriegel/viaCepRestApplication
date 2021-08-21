/**
 * 
 */
package com.example.viaCep.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.viaCep.model.AddressEntity;

/**
 * @author Jayme
 *
 */
public interface AddressRepository extends CrudRepository<AddressEntity, Long> {
	
	AddressEntity findByZip(String zip);

}
