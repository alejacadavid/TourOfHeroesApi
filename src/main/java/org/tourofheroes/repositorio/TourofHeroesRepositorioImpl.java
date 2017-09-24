package org.tourofheroes.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.tourofheroes.dominio.Hero;

public class TourofHeroesRepositorioImpl implements TourofHeroesRepository {

	@Override
	public List<Hero> getHeroes() {
		List<Hero> heroes = new ArrayList<Hero>();
		heroes.add(new Hero(1,"Alejandra"));
		heroes.add(new Hero(2,"Maribel"));
		heroes.add(new Hero(3,"Esteban"));
		return heroes;

	}

}
