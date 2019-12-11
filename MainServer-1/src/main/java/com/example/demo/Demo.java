package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class Demo {
	@RequestMapping(path = "/msg", method = RequestMethod.GET)
	public String demo() {
		return "data";
	}

}
