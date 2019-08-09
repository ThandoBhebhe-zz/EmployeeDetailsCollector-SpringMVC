package com.bhebhe.thando;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TheController {

	@RequestMapping("/")
	public String showHomePage() {
		return "homePage";
	}
	
	
	@RequestMapping("/showFormMethod")
	public String showForm() {
		return "theForm";
	}
	
	@RequestMapping("/showProcessFormMethod")
	public String showProcessForm(@RequestParam("name")String name, Model model){
		
		model.addAttribute("capsName",name.toUpperCase());
		 
		return "processForm";
	}
	
	
}
