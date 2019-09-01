package com.inti.dao.interfaces;

import com.inti.entities.Affaire;

public interface IAffaireDAO extends IDAO<Affaire> {
	Affaire findOneByName(String name);
}
