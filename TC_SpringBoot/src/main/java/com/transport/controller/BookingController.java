package com.transport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.transport.bean.Booking;
import com.transport.service.BookingService;

@Controller
public class BookingController {
	@Autowired
	private BookingService service;
	
	@RequestMapping("/bookingForm")
	public String showBookForm(Model m) {
		Booking book = new Booking();
		m.addAttribute("book",book);
		return "bookingForm";
	}
	
	@RequestMapping(value="/AddBooking",method=RequestMethod.POST)
	public String save(@ModelAttribute("book") Booking book) {
		service.save(book);
		return "ManagerWelcome";
	}
	
	@RequestMapping("/viewBooking")
	public String viewBooking(Model m) {
		List<Booking> listBooks = service.listAll();
		m.addAttribute("listBooks",listBooks);
		return "viewBooking";
	}
	
	@RequestMapping("/EditBooking/{truck_no}")
	public String editBooking(@PathVariable("truck_no") String truck_no,Model m) {
		Booking book = service.get(truck_no);
		m.addAttribute("book",book);
		return "editBooking";
	}
	
	@RequestMapping("/DeleteBooking/{truck_no}")
	public String deleteBooking(@PathVariable("truck_no") String truck_no) {
		service.delete(truck_no);
		return "redirect:/viewBooking";
	}
	
	@RequestMapping("/uviewBooking")
	public String uviewBooking(Model m) {
		List<Booking> listBooks = service.listAll();
		m.addAttribute("listBooks",listBooks);
		return "uviewBooking";
	}
}
