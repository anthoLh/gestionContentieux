package com.inti.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inti.dao.interfaces.IAffaireDAO;
import com.inti.entities.Affaire;

@Repository
public class AffaireDAO extends ManagerDAO<Affaire> implements IAffaireDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	public Affaire findOneByName(String name) {
		return null;

	}
}
