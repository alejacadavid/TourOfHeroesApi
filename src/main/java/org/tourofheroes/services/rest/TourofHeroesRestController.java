package org.tourofheroes.services.rest;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.tourofheroes.dominio.Hero;
import org.tourofheroes.repositorio.TourofHeroesRepositorioImpl;
import org.tourofheroes.repositorio.TourofHeroesRepository;

@RestController
@RequestMapping("/tourofheroes")
public class TourofHeroesRestController {
	private TourofHeroesRepository tourofHeroesRepository;
	
	public TourofHeroesRestController(){
		this.tourofHeroesRepository = new TourofHeroesRepositorioImpl();
	}
	
	@RequestMapping("listar")
	@ResponseBody
	  public List<Hero> getHeroes() {
		return tourofHeroesRepository.getHeroes();
	  }
	
	@RequestMapping("consultar")
	public Hero getHero(int id) throws DataNotFound{
		log.info("Entro a consultar");
		Optional<Hero> hero = tourofHeroesRepository.findById(id);
		if(!hero.isPresent()){
			throw new DataNotFound("No existe hero");
		}
		return hero.get();
	}

}


