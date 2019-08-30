package com.inti.dao.interfaces;

import com.inti.entities.Affaire;

public interface IAffaireDAO extends IDAO<Affaire> {
	Affaire findOneByName(Class<Affaire> c, String name);
}
