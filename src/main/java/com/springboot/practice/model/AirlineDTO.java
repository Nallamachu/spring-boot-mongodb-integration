package com.springboot.practice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AirlineDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@JsonIgnore
	private String _id;
	private Number id;
	private String name;
	private String Country;
	private String logo;
	private String slogan;
	private String head_quaters;
	private String website;
	private String established;

	public AirlineDTO() {
		super();
	}

	public AirlineDTO(String _id) {
		this._id = _id;
	}

	public AirlineDTO(Number id, String name, String country, String logo, String slogan, String head_quaters,
			String website, String established) {
		super();
		this.id = id;
		this.name = name;
		Country = country;
		this.logo = logo;
		this.slogan = slogan;
		this.head_quaters = head_quaters;
		this.website = website;
		this.established = established;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public Number getId() {
		return id;
	}

	public void setId(Number id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public String getHead_quaters() {
		return head_quaters;
	}

	public void setHead_quaters(String head_quaters) {
		this.head_quaters = head_quaters;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEstablished() {
		return established;
	}

	public void setEstablished(String established) {
		this.established = established;
	}

}
