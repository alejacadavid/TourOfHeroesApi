package org.tourofheroes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tourofheroes.dominio.Hero;

import java.util.List;
import java.util.Optional;

public interface TourofHeroesRepository extends JpaRepository<Hero, String> {
	
	public Optional<Hero> findById(int id);

	public List<Hero> removeById();

	public List<Hero> findAll();

}
