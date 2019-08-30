package com.inti.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inti.dao.interfaces.IAffaireDAO;
import com.inti.entities.Affaire;
import com.inti.service.interfaces.IAffaireService;

@Service
@Transactional
public class AffaireService extends ManagerService<Affaire> implements IAffaireService{
	@Autowired
	IAffaireDAO daoAffaire;
	
	@Override
	public Affaire findOneByName(Class<Affaire> affaire, String name) {
		return daoAffaire.findOneByName(affaire, name);
	}

}
