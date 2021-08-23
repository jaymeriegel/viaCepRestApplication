/**
 * 
 */
package com.example.viaCep.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.viaCep.rest.JacksonCustomAddressEntityDeserializer;
import com.example.viaCep.rest.JacksonCustomAddressEntitySerializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


/**
 * @author Jayme
 *
 */

@Entity
@Table(name = "adresses")
@JsonIgnoreProperties
@JsonSerialize(using = JacksonCustomAddressEntitySerializer.class)
@JsonDeserialize(using = JacksonCustomAddressEntityDeserializer.class)
public class AddressEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
		
	@Column(name = "zip")
	private String zip;
	
	@Column(name = "publicPlace")
	private String publicPlace;
	
	@Column(name = "complements")
	private String complements;
	
	@Column(name = "district")
	private String district;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "uf")
	private String uf;
	
	@Column(name = "ibge")
	private String ibge;
	
	@Column(name = "gia")
	private String gia;
	
	@Column(name = "ddd")
	private Integer ddd;
	
	@Column(name = "siafi")
	private String siafi;
	
	public AddressEntity() {}
	
	/**
	 * @param zip
	 * @param publicPlace
	 * @param complements
	 * @param district
	 * @param city
	 * @param uf
	 * @param ibge
	 * @param gia
	 * @param ddd
	 * @param siafi
	 */
	public AddressEntity(String zip, String publicPlace, String complements, String district, String city, String uf,
			String ibge, String gia, Integer ddd, String siafi) {
		super();
		this.zip = zip;
		this.publicPlace = publicPlace;
		this.complements = complements;
		this.district = district;
		this.city = city;
		this.uf = uf;
		this.ibge = ibge;
		this.gia = gia;
		this.ddd = ddd;
		this.siafi = siafi;
	}
	
	public AddressEntity(String zip, String publicPlace) {
		super();
		this.zip = zip;
		this.publicPlace = publicPlace;
	}
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}
	
	/**
	 * @return the publicPlace
	 */
	public String getPublicPlace() {
		return publicPlace;
	}
	
	/**
	 * @return the complements
	 */
	public String getComplements() {
		return complements;
	}
	
	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}
	
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * @return the uf
	 */
	public String getUf() {
		return uf;
	}
	
	/**
	 * @return the ibge
	 */
	public String getIbge() {
		return ibge;
	}
	
	/**
	 * @return the gia
	 */
	public String getGia() {
		return gia;
	}
	
	/**
	 * @return the ddd
	 */
	public Integer getDdd() {
		return ddd;
	}
	
	/**
	 * @return the siafi
	 */
	public String getSiafi() {
		return siafi;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * @param publicPlace the publicPlace to set
	 */
	public void setPublicPlace(String publicPlace) {
		this.publicPlace = publicPlace;
	}

	/**
	 * @param complements the complements to set
	 */
	public void setComplements(String complements) {
		this.complements = complements;
	}

	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @param uf the uf to set
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}

	/**
	 * @param ibge the ibge to set
	 */
	public void setIbge(String ibge) {
		this.ibge = ibge;
	}

	/**
	 * @param gia the gia to set
	 */
	public void setGia(String gia) {
		this.gia = gia;
	}

	/**
	 * @param ddd the ddd to set
	 */
	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	/**
	 * @param siafi the siafi to set
	 */
	public void setSiafi(String siafi) {
		this.siafi = siafi;
	}

	@Override
	public String toString() {
		return String.format(
				"AddressEntity [id=%s, zip=%s, publicPlace=%s, complements=%s, district=%s, city=%s, uf=%s, ibge=%s, gia=%s, ddd=%s, siafi=%s]",
				id, zip, publicPlace, complements, district, city, uf, ibge, gia, ddd, siafi);
	}
	
	
	
	
	
	
}
