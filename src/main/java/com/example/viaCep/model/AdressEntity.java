/**
 * 
 */
package com.example.viaCep.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Jayme
 *
 */

@Entity
public class AdressEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String zip;
	private String publicPlace;
	private String complements;
	private String district;
	private String city;
	private String uf;
	private String ibge;
	private String gia;
	private Integer ddd;
	private String siafi;
	
	public AdressEntity() {}
	
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
	public AdressEntity(String zip, String publicPlace, String complements, String district, String city, String uf,
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
	
	
}
