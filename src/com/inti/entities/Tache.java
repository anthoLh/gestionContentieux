package com.inti.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Tache implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTache;
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	private String titre;
	private String descriptionTache;
	private boolean statutAudience;
	@ManyToOne
	private Utilisateur utilisateur;
	@ManyToOne
	private Affaire affaire;
	@ManyToOne
	private Tribunal tribunal;

	@OneToMany(mappedBy = "tache", fetch = FetchType.EAGER)
	private Set<Phase> listPhase = new HashSet<Phase>();

	public Tache() {
	}

	public Tache(Date dateCreation, String titre, String descriptionTache, boolean statutAudience,
			Utilisateur utilisateur, Affaire affaire, Tribunal tribunal, Set<Phase> listPhase) {
		this.dateCreation = dateCreation;
		this.titre = titre;
		this.descriptionTache = descriptionTache;
		this.statutAudience = statutAudience;
		this.utilisateur = utilisateur;
		this.affaire = affaire;
		this.tribunal = tribunal;
		this.listPhase = listPhase;
	}

	public Long getIdTache() {
		return idTache;
	}

	public void setIdTache(Long idTache) {
		this.idTache = idTache;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return descriptionTache;
	}

	public void setDescription(String descriptionTache) {
		this.descriptionTache = descriptionTache;
	}

	public boolean isStatutAudience() {
		return statutAudience;
	}

	public void setStatutAudience(boolean statutAudience) {
		this.statutAudience = statutAudience;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Affaire getAffaire() {
		return affaire;
	}

	public void setAffaire(Affaire affaire) {
		this.affaire = affaire;
	}

	public Tribunal getTribunal() {
		return tribunal;
	}

	public void setTribunal(Tribunal tribunal) {
		this.tribunal = tribunal;
	}

	public Set<Phase> getListphase() {
		return listPhase;
	}

	public void setListphase(Set<Phase> listPhase) {
		this.listPhase = listPhase;
	}

}
