package com.inti.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inti.dao.interfaces.IUtilisateurDAO;
import com.inti.entities.Utilisateur;

@Repository
public class UtilisateurDAO extends ManagerDAO<Utilisateur> implements IUtilisateurDAO{

	@Override
	public Utilisateur findOneByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//https://docs.spring.io/spring-ldap/docs/1.3.2.RELEASE/reference/html/dirobjectfactory.html
	
/*	@Autowired
	
	   private static class PersonContextMapper implements ContextMapper {
	      public Object mapFromContext(Object ctx) {
	         DirContextAdapter context = (DirContextAdapter)ctx;
	         Person p = new Person();
	         p.setFullName(context.getStringAttribute("cn"));
	         p.setLastName(context.getStringAttribute("sn"));
	         p.setDescription(context.getStringAttribute("description"));
	         return p;
	      }
	   }
	} */
}

