package org.tourofheroes.services.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tourofheroes")
public class TourofHeroesRestController {
	
	@RequestMapping("/index")
	  public String index() {
	    return "Hola mundo ";
	  }
}


