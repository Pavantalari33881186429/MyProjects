package com.assignment.project1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController()
public class MyController {
    
	@GetMapping("/name")
	public String nameHandler() {
      return "BANK NAME: State Bank of India";
	}
	@GetMapping("/address")
	public String addresHandler() {
      return "BANK ADDRESS: NO.15-512/8, Sadashiva Compound, RF Road, Tadipatri, Anantapur dist(515411)";
	}
}
