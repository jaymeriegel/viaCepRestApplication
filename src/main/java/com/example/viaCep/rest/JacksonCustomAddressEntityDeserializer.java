package com.example.viaCep.rest;

import java.io.IOException;

import com.example.viaCep.model.AddressEntity;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class JacksonCustomAddressEntityDeserializer extends StdDeserializer<AddressEntity> {
	
	
	

	public JacksonCustomAddressEntityDeserializer(){
		this(null);
	}

	public JacksonCustomAddressEntityDeserializer(Class<AddressEntity> t) {
		super(t);
	}
	
	@Override
	public AddressEntity deserialize(JsonParser parser, DeserializationContext context) throws IOException, JsonProcessingException {
		JsonNode node = parser.getCodec().readTree(parser);
		AddressEntity address = new AddressEntity();
		String zip = node.get("cep").asText(null);
		String publicPlace = node.get("logradouro").asText(null);
		String complements = node.get("complemento").asText(null);
		String district = node.get("bairro").asText(null);
		String city = node.get("localidade").asText(null);
		String uf = node.get("uf").asText(null);
		String ibge = node.get("ibge").asText(null);
		String gia = node.get("gia").asText(null);
		String ddd = node.get("ddd").asText(null);
		String siafi = node.get("siafi").asText(null);
		
		address.setZip(zip);
		address.setPublicPlace(publicPlace);
		address.setComplements(complements);
		address.setDistrict(district);
		address.setCity(city);
		address.setUf(uf);
		address.setIbge(ibge);
		address.setGia(gia);
		address.setDdd(Integer.getInteger(ddd));
		address.setSiafi(siafi);
		        
		return address;
	}
	
	
	
	

}
