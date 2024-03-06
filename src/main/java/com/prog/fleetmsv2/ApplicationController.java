package com.prog.fleetmsv2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

	@GetMapping("/index")
	public String home() { return "index"; }
	
	@GetMapping("/_layout")
	public String layout() { return "_layout"; }
	
	@GetMapping("/table-basic")
	public String tableBasic() { return "table-basic"; }
	
	@GetMapping("/index2")
	public String index2() { return "index2"; }

	@GetMapping("/hr")
	public String hr() { return "/hr/index"; }
	
	@GetMapping("/fleet")
	public String fleet() { return "/fleet/index"; }
	
	@GetMapping("/helpdesk")
	public String helpDesk() { return "/helpdesk/index"; }
	
	@GetMapping("/parameters")
	public String parameters() { return "/parameters/index"; }
	
	@GetMapping("/accounts")
	public String accounts() { return "/accounts/index"; }
	
	@GetMapping("/payroll")
	public String payroll() { return "/payroll/index"; }
}
