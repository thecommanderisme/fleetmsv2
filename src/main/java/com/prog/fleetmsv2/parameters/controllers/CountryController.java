package com.prog.fleetmsv2.parameters.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prog.fleetmsv2.parameters.services.CountryService;
import com.prog.fleetmsv2.parameters.models.Country;

@Controller
public class CountryController {
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/parameters/countries")
	public String getAll(Model model) {
		List<Country> countries = countryService.findAll();
		model.addAttribute("countries",countries);
		return "parameters/countries";
	} 
	
	@GetMapping("/parameters/countryAdd")
    public String addCountry(){
        return "parameters/countryAdd";
    }
	
	 //The op parameter is either Edit or Details
    @GetMapping("/parameters/country/{op}/{id}")
    public String editCountry(@PathVariable Integer id, @PathVariable String op, Model model){
        Country country = countryService.getById(id);
        model.addAttribute("country", country);
        return "/parameters/country"+ op;
    }
   
    @GetMapping("/parameters/country/{id}")
    @ResponseBody
    public Country getCountry(@PathVariable Integer id){
        return countryService.getById(id);
    }
   
	@PostMapping("/parameters/countries")
    public String save(Country country){
        countryService.save(country);
        return "redirect:/parameters/countries";
    }
	
	@RequestMapping(value = "/parameters/countries/delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public  String delete(@PathVariable Integer id){
        countryService.delete(id);
        return "redirect:/parameters/countries";
    }

}
