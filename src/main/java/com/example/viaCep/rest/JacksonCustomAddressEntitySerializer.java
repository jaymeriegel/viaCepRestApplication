package com.example.viaCep.rest;

import java.io.IOException;

import com.example.viaCep.model.AddressEntity;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class JacksonCustomAddressEntitySerializer extends StdSerializer<AddressEntity> {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JacksonCustomAddressEntitySerializer() {
		this(null);
	}
	
	public JacksonCustomAddressEntitySerializer(Class<AddressEntity> t) {
		super(t);
	}
	
	@Override
	public void serialize(AddressEntity address, JsonGenerator jgen, SerializerProvider provider) throws IOException {
		
		jgen.writeStartObject();
		if (address.getId() == null) {
			jgen.writeNullField("id");
		} else {
			jgen.writeNumberField("id", address.getId());
		}

		jgen.writeStringField("cep", address.getZip());
		jgen.writeStringField("logradouro", address.getPublicPlace());
		jgen.writeStringField("complemento", address.getComplements());
		jgen.writeStringField("bairro", address.getDistrict());
		jgen.writeStringField("localidade", address.getCity());
		jgen.writeStringField("uf", address.getUf());
		jgen.writeStringField("ibge", address.getIbge());
		jgen.writeStringField("gia", address.getGia());
		jgen.writeStringField("ddd", String.valueOf(address.getDdd()));
		jgen.writeStringField("siafi", address.getSiafi());
		
	}
	
	
	
	
	
	

}
