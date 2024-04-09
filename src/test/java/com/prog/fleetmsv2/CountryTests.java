package com.prog.fleetmsv2;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.prog.fleetmsv2.parameters.repositories.CountryRepository;
import com.prog.fleetmsv2.parameters.models.Country;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CountryTests {

	@Autowired
	private CountryRepository repository;
	//findbyid
	@Test
	public void testFindyById() {
		Country country = repository.findById(2).orElse(null);
		assertNotNull(country);
	}
	
	@Test
	public void testFindyByIdEmpty() {
		Country country = repository.findById(100).orElse(null);
		assertNotNull(country);
	}
	
	@Test
	public void testFindyByIdNull() {
		Country country = repository.findById(100).orElse(null);
		assertNull(country);
	}
	
	//findbyidempty
}
