package com.example.viaCep;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
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
		mvc.perform(MockMvcRequestBuilders.get("/api/adresses/zip/123")
				.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andExpect(content().contentType("application/json;charset=UTF-8"))
		.andExpect(content().json("{\"zip\":\"123\",\"publicPlace\":\"teste\",\"complements\":\"teste1\",\"district\":\"teste2\",\"city\":\"teste3\",\"uf\":\"teste4\",\"ibge\":\"teste5\",\"gia\":\"teste6\",\"ddd\":123,\"siafi\":\"teste8\"}"));		
	}
	
	@Test
	void testGetAdressNotFound() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/api/adresses/zip/")
				.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isNotFound());
	}

}


