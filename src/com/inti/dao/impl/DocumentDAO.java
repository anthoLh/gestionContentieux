package com.inti.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.inti.dao.interfaces.IDocumentDAO;
import com.inti.entities.Affaire;
import com.inti.entities.Document;
import com.inti.entities.Utilisateur;

@Repository
public class DocumentDAO extends ManagerDAO<Document> implements IDocumentDAO{


}
