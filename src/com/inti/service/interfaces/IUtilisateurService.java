package com.inti.service.interfaces;

import com.inti.entities.Utilisateur;

public interface IUtilisateurService extends IService<Utilisateur>{
	Utilisateur findOneByName(String name);
}
