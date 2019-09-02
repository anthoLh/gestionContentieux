package com.inti.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Affaire implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAffaire;
	private String reference;
	private String titre;
	private String descriptionAffaire;
	private int statut;
	@OneToMany(mappedBy="affaire", fetch=FetchType.EAGER)
	private Set<Tache> listTache = new HashSet<Tache>();
	@OneToMany(mappedBy="affaire",fetch=FetchType.EAGER)
	private Set<Document> listDocument = new HashSet<Document>();
	public Affaire() {
	}
	public Affaire(String reference, String titre, String descriptionAffaire, int statut, Set<Tache> listTache,
			Set<Document> listDocument) {
		this.reference = reference;
		this.titre = titre;
		this.descriptionAffaire = descriptionAffaire;
		this.statut = statut;
		this.listTache = listTache;
		this.listDocument = listDocument;
	}
	public Long getIdAffaire() {
		return idAffaire;
	}
	public void setIdAffaire(Long idAffaire) {
		this.idAffaire = idAffaire;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescriptionAffaire() {
		return descriptionAffaire;
	}
	public void setDescriptionAffaire(String descriptionAffaire) {
		this.descriptionAffaire = descriptionAffaire;
	}
	public int getStatut() {
		return statut;
	}
	public void setStatut(int statut) {
		this.statut = statut;
	}
	public Set<Tache> getListTache() {
		return listTache;
	}
	public void setListTache(Set<Tache> listTache) {
		this.listTache = listTache;
	}
	public Set<Document> getListDocument() {
		return listDocument;
	}
	public void setListDocument(Set<Document> listDocument) {
		this.listDocument = listDocument;
	}
	
	
}
