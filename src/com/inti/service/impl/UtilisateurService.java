package com.inti.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inti.dao.interfaces.IUtilisateurDAO;
import com.inti.entities.Utilisateur;
import com.inti.service.interfaces.IUtilisateurService;

@Service
@Transactional
public class UtilisateurService extends ManagerService<Utilisateur> implements IUtilisateurService {

	@Autowired
	IUtilisateurDAO daoUtilisateur;
	
	@Override
	public Utilisateur findOneByName(String name) {
		return daoUtilisateur.findOneByName(name);
	}

	@Override
	public Utilisateur findOneByUsername(String username) {
		return daoUtilisateur.findOneByUsername(username);
	}

}
