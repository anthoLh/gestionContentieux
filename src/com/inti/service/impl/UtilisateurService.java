package com.inti.service.impl;

import java.util.List;

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
	public List<Utilisateur> findOneByName(String nomUtilisateur) {
		return daoUtilisateur.findOneByName(nomUtilisateur);
	}
	
	@Override
	public Utilisateur findOneByUsername(String username) {
		return daoUtilisateur.findOneByUsername(username);
	}

}
