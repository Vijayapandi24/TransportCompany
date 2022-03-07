package com.transport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.transport.bean.Manager;
import com.transport.bean.Truck;
import com.transport.service.ManagerService;

@Controller
public class ManagerController {
	@Autowired
	private ManagerService service;
	
	@RequestMapping("/createManager")
	public String showManagerForm(Model m) {
		Manager manager = new Manager();
		m.addAttribute("manager",manager);		
		return "managerForm";
	}
	
	@RequestMapping(value="/msave",method=RequestMethod.POST)
	public String saveTruck(@ModelAttribute("manager") Manager manager) {
		service.save(manager);
		return "AdminWelcome";
	}
	
	@RequestMapping("/viewManager")
	public String viewTruck(Model m) {
		List<Manager> listManagers= service.listAll();
		m.addAttribute("listManagers",listManagers);
		return "viewManager";
	}
	
	@RequestMapping(value="/editmanager/{branch}")
	public String editManager(@PathVariable("branch") String branch,Model m) {
		Manager manager = service.get(branch);
		m.addAttribute("manager",manager);
		return "editManager";
	}
	
	
	@RequestMapping(value="/deletemanager/{branch}")
	public String deleteManager(@PathVariable("branch") String branch) {
		service.delete(branch);
		return "redirect:/viewManager";
	}
}
