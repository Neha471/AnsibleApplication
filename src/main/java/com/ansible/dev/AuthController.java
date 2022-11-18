package com.ansible.dev;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
	@GetMapping("/")
	public String signup(Model model) {
		model.addAttribute("numbers", new Numbers());
	    return "Created";
	}
}
