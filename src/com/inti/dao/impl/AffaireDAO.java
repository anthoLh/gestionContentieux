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
	
	public Affaire findOneByName(Class<Affaire> affaire, String name) {
		Session  session = this.sessionFactory.getCurrentSession();
		return (Affaire)session.get(affaire, name);
	}
}
