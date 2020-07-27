package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Trainer {

	@RequestMapping(value="/trainee/morgan")
	public String traineeMorgan() {
		return "Morgan the trainee";
	}
	
	@RequestMapping(value="/consultant/morgan")
	public String consultantMorgan() {
		return "Morgan the consultant";
	}
}
