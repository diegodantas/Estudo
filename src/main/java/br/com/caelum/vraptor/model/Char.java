package br.com.caelum.vraptor.model;

import java.io.Serializable;

public class Char implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2401484278571525788L;

	private String name;
	private Double[] data;
	
	public Char(String name, Double[] data) {
		this.name = name;
		this.data = data;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double[] getData() {
		return data;
	}
	public void setData(Double[] data) {
		this.data = data;
	}

}
