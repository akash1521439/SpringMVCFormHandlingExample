package com.demo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	@GetMapping(value="/test")
	public String testContro(Model model) {
		String msg ="I am test";
		model.addAttribute("msg", msg);
		
		return "test";
	}
}
