package org.tourofheroes.services.rest;

import java.util.List;
import java.util.Optional;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.tourofheroes.dominio.Hero;
import org.tourofheroes.exception.DataNotFound;
import org.tourofheroes.repositorio.TourofHeroesRepository;

@RestController
@RequestMapping("/tourofheroes")
public class TourofHeroesRestController {
	private TourofHeroesRepository tourofHeroesRepository;
	
	
	
	

	public TourofHeroesRestController(TourofHeroesRepository tourofHeroesRepository){
		super();
		this.tourofHeroesRepository = tourofHeroesRepository;
	}
	
	
	@RequestMapping("listar")
	public List<Hero> getHeroes(){
		return tourofHeroesRepository.findAll();
	}
	
	@RequestMapping("consultar")
	public Hero getHero(int id) throws DataNotFound{
		
		Optional<Hero> hero = tourofHeroesRepository.findById(id);
		if(!hero.isPresent()){
			throw new DataNotFound("No existe hero");
		}
		return hero.get();
	}
	
	@RequestMapping("borrar")
	public List<Hero> removeById(int id){
		return tourofHeroesRepository.removeById();
	}
}


