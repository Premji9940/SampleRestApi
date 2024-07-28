package com.nit.ctrl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {
	
	Logger log=LoggerFactory.getLogger(RestApi.class);
	@GetMapping("/")
	public String welcome() {
		log.info("******Welcome Method started***********");
		log.info("******Welcome Method finished***********");
	
		return "<h1 style=color:pink;text-align:center>Welcome to Rest Controller for jenkins setup </h1>";
	}
	
	@GetMapping("/wish/{name}")
	public String wish(@PathVariable String name) {
		log.info("******Wish Method started***********");
		log.info("******Wish Method ended***********");

	
		return "<h1 style=color:brown;text-align:center>hello how r u are you working with jenkins </h1>";
	}
	

}
