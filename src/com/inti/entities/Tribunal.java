package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Tribunal implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTribunal;
	private String adresse;
	private Double fax;
	private Double tel;
	private String region;
	@OneToOne
	private Tache tache;

	public Tribunal() {
	}

	public Tribunal(String adresse, Double fax, Double tel, String region, Tache tache) {
		super();
		this.adresse = adresse;
		this.fax = fax;
		this.tel = tel;
		this.region = region;
		this.tache = tache;
	}

	public Long getIdTribunal() {
		return idTribunal;
	}

	public void setIdTribunal(Long idTribunal) {
		this.idTribunal = idTribunal;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Double getFax() {
		return fax;
	}

	public void setFax(Double fax) {
		this.fax = fax;
	}

	public Double getTel() {
		return tel;
	}

	public void setTel(Double tel) {
		this.tel = tel;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Tache getTache() {
		return tache;
	}

	public void setTache(Tache tache) {
		this.tache = tache;
	}


}
