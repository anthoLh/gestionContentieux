package com.inti.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inti.dao.interfaces.IAffaireDAO;
import com.inti.entities.Affaire;

@Repository
public class AffaireDAO extends ManagerDAO<Affaire> implements IAffaireDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Affaire findOneByTitreAffaire(String titre) {
		Session session = this.sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(Affaire.class);
		crit.add(Restrictions.eq("titre", titre));
		return (Affaire) crit.uniqueResult();
	}

}
