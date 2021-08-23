package com.example.viaCep;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
class ViaCepApplicationDuo2ApplicationTests {
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	void testGetAdressSuccess() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/api/addresses/zip/94935410")
		.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andExpect(content().contentType("application/json;charset=UTF-8"))
		.andExpect(jsonPath("$.id").value(0));		
	}
	
	@Test
	void testGetAdressNotFound() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/api/adresses/zip/")
				.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isNotFound());
	}

}


