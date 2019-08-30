package com.inti.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inti.dao.interfaces.IUtilisateurDAO;
import com.inti.entities.Utilisateur;

@Repository
public class UtilisateurDAO extends ManagerDAO<Utilisateur> implements IUtilisateurDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Utilisateur findOneByName(Class<Utilisateur> utilisateur, String name) {
		Session  session = this.sessionFactory.getCurrentSession();
		return (Utilisateur)session.get(utilisateur, name);
	}
}
