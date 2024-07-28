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
	
		return "<h1 style=color:yellow;text-align:center>Welcome to Rest Controller Application Using jenkins</h1>";
	}
	
	@GetMapping("/wish/{name}")
	public String wish(@PathVariable String name) {
		log.info("******Wish Method started***********");
		log.info("******Wish Method ended***********");

	
		return "<h1 style=color:brown;text-align:center>hello are you working on jenkins </h1>";
	}
	

}
