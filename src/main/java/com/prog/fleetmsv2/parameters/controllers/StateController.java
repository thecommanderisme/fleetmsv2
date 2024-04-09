package com.prog.fleetmsv2.parameters.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prog.fleetmsv2.parameters.services.CountryService;
import com.prog.fleetmsv2.parameters.services.StateService;
import com.prog.fleetmsv2.parameters.models.State;

@Controller
public class StateController {
	@Autowired private StateService stateService;
	@Autowired private CountryService countryService;

	public  Model addModelAttribute(Model model){
		model.addAttribute("states", stateService.findAll());
		model.addAttribute("countries", countryService.findAll());
		return model;
	}
	
	@GetMapping("/parameters/states")
	public String getAll(Model model) {
		List<State> states = stateService.findAll();
		model.addAttribute("states", states);
		return "parameters/states";
	} 
	
	@GetMapping("/parameters/stateAdd")
	public String addState(Model model){
		addModelAttribute(model);
		return "parameters/stateAdd";
	}
	
	 //The op parameter is either Edit or Details
    @GetMapping("/parameters/state/{op}/{id}")
    public String editState(@PathVariable Integer id, @PathVariable String op, Model model){
    	addModelAttribute(model);
		model.addAttribute("state", stateService.findById(id));
        return "/parameters/state"+ op;
    }
	
	@PostMapping("/parameters/states")
    public String save(State state){
        stateService.save(state);
        return "redirect:/parameters/states";
    }
	
	@RequestMapping(value = "/parameters/states/delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public  String delete(@PathVariable Integer id){
        stateService.delete(id);
        return "redirect:/parameters/states";
    }
}
