package org.tourofheroes.repositorio;

import org.tourofheroes.dominio.Hero;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface TourofHeroesRepository extends JpaRepository<Hero, String>{

	public Optional<Hero> findById(int id);

}
