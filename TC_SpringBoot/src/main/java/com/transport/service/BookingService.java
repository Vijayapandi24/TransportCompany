package com.transport.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transport.bean.Booking;
import com.transport.repository.BookingRepository;

@Service
@Transactional
public class BookingService {
	@Autowired
	private BookingRepository repo;
	
	public void save(Booking book) {
		repo.save(book);
	}
	
	public List<Booking> listAll() {
		return repo.findAll();
	}
	
	public Booking get(String truck_no) {
		return repo.findById(truck_no).get();
	}
	
	public void delete(String truck_no) {
		repo.deleteById(truck_no);
	}
}
