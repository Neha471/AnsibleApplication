package com.ansible.dev;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
 

@Controller
public class ResultController {
	@PostMapping(value = "/calculate" )
	public String calculate(@ModelAttribute Numbers numbers, Model model) {
		int num1=numbers.getNum1();
		int num2=numbers.getNum2();
		System.out.println(num1+num2);
		
		String fun=numbers.getFun();
		String result="null";
		System.out.println(fun);
		if(fun.equals("add")) 
			result= String.valueOf(num1+num2);
		else if(fun.equals("sub"))
			result= String.valueOf(num1-num2);
		else if(fun.equals("mul"))
			result= String.valueOf(num1*num2);
		else if(fun.equals("div"))
			result= String.valueOf(num1/num2);
		model.addAttribute("result", result);
		return "result";
	}
}
