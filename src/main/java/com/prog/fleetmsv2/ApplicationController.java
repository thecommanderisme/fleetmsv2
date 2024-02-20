package com.prog.fleetmsv2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

	@GetMapping("/index")
	public String home() {
		return "index";
	}
	
	@GetMapping("/pages-profile")
	public String pagesProfile() {
		return "pages-profile";
	}
}
