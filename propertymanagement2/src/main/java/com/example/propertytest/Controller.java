package com.example.propertytest;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/getownerdetail")
public class Controller {
static {
	System.out.println("controller");
}
	@Autowired
	Services services;

	@RequestMapping(value = "/",method = RequestMethod.POST)
	public String addOwner(@RequestBody  Owner owner) {
		services.addOwner(owner);
		return "Owner Added Successfully";
	}
	
	@RequestMapping(value = "/",method = RequestMethod.GET ,produces = "application/json")
	public List<Owner> getAllOwner() {
		return services.getAllOwner();
	}
	
	@RequestMapping(value = "/{oid}",method = RequestMethod.GET)
	public Owner getOwner(@PathVariable("oid") int oid) {
		
	return services.getOwner(oid);
	}
	
	
}
