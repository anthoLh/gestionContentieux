package com.inti.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inti.dao.interfaces.IDAO;
import com.inti.dao.interfaces.IUtilisateurDAO;
import com.inti.entities.Utilisateur;
import com.inti.service.interfaces.IUtilisateurService;

@Service
@Transactional
public class UtilisateurService extends ManagerService<Utilisateur> implements IUtilisateurService {

	@Autowired
	IUtilisateurDAO daoUtilisateur;
	
	@Override
	public Utilisateur findOneByName(Class<Utilisateur> utilisateur, String name) {
		return daoUtilisateur.findOneByName(utilisateur, name);
	}

}
