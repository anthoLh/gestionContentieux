package com.inti.dao.interfaces;

import java.util.List;

import com.inti.entities.Utilisateur;

public interface IUtilisateurDAO extends IDAO<Utilisateur>{
	List<Utilisateur> findOneByName(String nomUtilisateur);
	Utilisateur findOneByUsername(String username);
}
