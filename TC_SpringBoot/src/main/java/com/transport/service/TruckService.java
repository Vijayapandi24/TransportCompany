package com.transport.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transport.bean.Truck;
import com.transport.repository.TruckRepository;

@Service
@Transactional
public class TruckService {
	@Autowired
	private TruckRepository repo;
	
	public void save(Truck truck) {
		repo.save(truck);
	}
	
	public List<Truck> listAll() {
		return repo.findAll();
	}
	
	public Truck get(String truck_no) {
		return repo.findById(truck_no).get();
	}
	
	public void delete(String truck_no) {
		repo.deleteById(truck_no);
	}
}
