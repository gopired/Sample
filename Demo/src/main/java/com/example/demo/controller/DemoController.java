package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping(path = "/getName")
	public String getName() {
		return "Demo";
	}
	@PutMapping(path = "/updateName")
	public String putName(){
		return "DemoPut";
	}
	@PostMapping(path="/insertName")
	public String updateName(){
		return"Sucessfully Inserted ";
	}
	
	@DeleteMapping(path="/deleteName")
	public String deleteName(){
		return"Sucessfully Deleted";
	}
	

}
