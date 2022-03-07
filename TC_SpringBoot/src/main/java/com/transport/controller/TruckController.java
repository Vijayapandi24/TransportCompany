package com.transport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.transport.bean.Truck;
import com.transport.service.TruckService;

@Controller
public class TruckController {
	@Autowired
	private TruckService service;
	
	@RequestMapping("/truckform")
	public String showTruckForm(Model m) {
		Truck truck = new Truck();
		m.addAttribute("truck",truck);		
		return "truckForm";
	}
	
	@RequestMapping(value="/tsave",method=RequestMethod.POST)
	public String saveTruck(@ModelAttribute("truck") Truck truck) {
		service.save(truck);
		return "AdminWelcome";
	}
	
	@RequestMapping("/viewTruck")
	public String viewTruck(Model m) {
		List<Truck> listTrucks = service.listAll();
		m.addAttribute("listTrucks",listTrucks);
		return "viewTruck";
	}
	
	@RequestMapping(value="/editTruck/{truck_no}")
	public String editTruck(@PathVariable("truck_no") String truck_no,Model m) {
		Truck truck = service.get(truck_no);
		m.addAttribute("truck",truck);
		return "editTruck";
	}
	
	
	@RequestMapping(value="/deleteTruck/{truck_no}")
	public String deleteTruck(@PathVariable("truck_no") String truck_no) {
		service.delete(truck_no);
		return "redirect:/viewTruck";
	}
	
	@RequestMapping("/searchTruck")
	public String showSearch() {
		return "searchTruck";
	}
	
	@RequestMapping("/uviewTruck")
	public String uviewTruck(Model m) {
		List<Truck> listTrucks = service.listAll();
		m.addAttribute("listTrucks",listTrucks);
		return "uviewTruck";
	}
}
