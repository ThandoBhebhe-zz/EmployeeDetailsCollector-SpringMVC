package com.bhebhe.thando;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/hello")
public class OtherController {
	
	@RequestMapping("/")
	public String showFormMethod() {
		return null;
	}

}
