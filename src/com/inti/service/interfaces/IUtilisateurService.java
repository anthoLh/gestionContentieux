package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Utilisateur;

public interface IUtilisateurService extends IService<Utilisateur>{
	List<Utilisateur> findOneByName(String nomUtilisateur);
	Utilisateur findOneByUsername(String username);
}
