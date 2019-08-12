package com.codingdojo.Routing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
	
	@RequestMapping(value = "/{value}", method=RequestMethod.GET)
	public String dojo(@PathVariable("value") String value) {
		if(value.equals("dojo")) {
			return "The dojo is awesome!";	
		}
		else if(value.equals("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California.";
		}
		else if(value.equals("san-jose")) {
			return "SJ dojo is the headquarters";
		}
		else {
			return "Sorry "+value+" is not a valid path.";
		}
	}
	

}