package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Utilisateur;
import com.inti.service.interfaces.IUtilisateurService;

@CrossOrigin("*")
@RestController
public class UtilisateurController {
	@Autowired
	IUtilisateurService utilisateurService;
	
	@RequestMapping(value="utilisateurs", method = RequestMethod.GET)
	public List<Utilisateur> findAllUtilisateur(){
		return utilisateurService.findAll(Utilisateur.class);
	}
	@RequestMapping(value="utilisateurs/id/{idUtilisateur}", method = RequestMethod.GET)
	public Utilisateur findOneUtilisateur(@PathVariable("idUtilisateur") Long idUtilisateur) {
		return utilisateurService.findOne(Utilisateur.class, idUtilisateur);
	} 
	
	@RequestMapping(value="utilisateurs/nomUtilisateur/{nomUtilisateur}", method = RequestMethod.GET)
	public List<Utilisateur> findByUsername(@PathVariable("nomUtilisateur") String nomUtilisateur) {
		return utilisateurService.findOneByName(nomUtilisateur);
	}

	@RequestMapping(value="utilisateurs", method = RequestMethod.POST)
	public void saveUtilisateur(@RequestBody Utilisateur utilisateur) {
		utilisateurService.save(utilisateur);
	}
	@RequestMapping(value="utilisateurs/{idUtilisateur}", method = RequestMethod.DELETE)
	public void deleteUtilisateur(@PathVariable("idUtilisateur") Long idUtilisateur) {
		Utilisateur u= utilisateurService.findOne(Utilisateur.class, idUtilisateur);
		utilisateurService.remove(u);
	}
	@RequestMapping(value="utilisateurs/{idUtilisateur}", method= RequestMethod.PUT)
	public void updateUtilisateur(@PathVariable("idUtilisateur") Long idUtilisateur,@RequestBody Utilisateur utilisateur) {
		Utilisateur currentUtilisateur = utilisateurService.findOne(Utilisateur.class, idUtilisateur);
		currentUtilisateur.setEmail(utilisateur.getEmail());
		currentUtilisateur.setListRole(utilisateur.getListRole());
		currentUtilisateur.setListTache(utilisateur.getListTache());
		currentUtilisateur.setNomUtilisateur(utilisateur.getNomUtilisateur());
		currentUtilisateur.setPassword(utilisateur.getPassword());
		currentUtilisateur.setPrenomUtilisateur(utilisateur.getPrenomUtilisateur());
		currentUtilisateur.setUsername(utilisateur.getUsername());
		utilisateurService.update(currentUtilisateur);	
	}
	
	
}
