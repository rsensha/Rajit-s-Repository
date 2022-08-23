package com.springboot_Calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculatorServices {
	
	@GetMapping("/add/{x}/{y}")
	public int addition(@PathVariable int x , @PathVariable int y) {
		
		return  x+y;
	}
	
	@GetMapping("/sub/{x}/{y}")
	public int subtraction(@PathVariable int x , @PathVariable int y) {
		
		return x-y ; 
	}
	
	@GetMapping("/div/{x}/{y}")
	public int division(@PathVariable int x , @PathVariable int y) {
		
		return x/y;
	}
	
	@GetMapping("mul/{x}/{y}")
	public int multiplication(@PathVariable int x, @PathVariable int y) {
		return x*y;
		
	}

}
