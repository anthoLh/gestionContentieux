package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Affaire;
import com.inti.service.interfaces.IAffaireService;

@CrossOrigin("*")
@RestController
public class AffaireController {
	@Autowired
	IAffaireService affaireService;

	@RequestMapping(value = "affaires", method = RequestMethod.GET)
	public List<Affaire> findAll() {
		return affaireService.findAll(Affaire.class);
	}

	@RequestMapping(value = "affaires/{idAffaire}", method = RequestMethod.GET)
	public Affaire findOne(@PathVariable("idAffaire") Long idAffaire) {
		return affaireService.findOne(Affaire.class, idAffaire);
	}

	@RequestMapping(value="affaires/{nomAffaire}", method = RequestMethod.GET)
	public Affaire findOneByName(@PathVariable("nomAffaire") String name) {
		return affaireService.findOneByName(name);
	}
	
	@RequestMapping(value = "affaires", method = RequestMethod.POST)
	public void saveAffaire(@RequestBody Affaire affaire) {
		affaireService.save(affaire);
	}

	@RequestMapping(value = "affaires/{idAffaire}", method = RequestMethod.DELETE)
	public void deleteAffaire(@PathVariable("idAffaire") Long idAffaire) {
		Affaire a= affaireService.findOne(Affaire.class, idAffaire);
		affaireService.remove(a);
	};
	

	@RequestMapping(value = "affaires/{idAffaire}", method = RequestMethod.PUT)
	public void updateAffaire(@PathVariable("idAffaire") Long idAffaire, @RequestBody Affaire affaire) {
		Affaire currentAffaire = affaireService.findOne(Affaire.class, idAffaire);
		currentAffaire.setDescriptionAffaire(affaire.getDescriptionAffaire());
		currentAffaire.setListDocument(affaire.getListDocument());
		currentAffaire.setListTache(affaire.getListTache());
		currentAffaire.setReference(affaire.getReference());
		currentAffaire.setStatut(affaire.getStatut());
		currentAffaire.setTitre(affaire.getTitre());
		affaireService.save(currentAffaire);
	}
}
