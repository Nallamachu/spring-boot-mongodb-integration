package com.springboot.practice.model;

import java.io.Serializable;
import java.util.List;

public class PassengerDetails implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer totalPassengers;
	private Integer totalPages;
	private List<PassengerDTO> data;

	public Number getTotalPassengers() {
		return totalPassengers;
	}

	public void setTotalPassengers(Integer totalPassengers) {
		this.totalPassengers = totalPassengers;
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public List<PassengerDTO> getData() {
		return data;
	}

	public void setData(List<PassengerDTO> data) {
		this.data = data;
	}

}
