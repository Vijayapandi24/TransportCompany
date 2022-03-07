package com.transport.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transport.bean.Manager;
import com.transport.repository.ManagerRepository;

@Service
@Transactional
public class ManagerService {

	@Autowired
	private ManagerRepository repo;
	
	public void save(Manager manager) {
		repo.save(manager);
	}
	
	public  List<Manager> listAll() {
		return repo.findAll();
	}
	
	public Manager get(String branch) {
		return repo.findById(branch).get();
	}
	
	public void delete(String branch) {
		repo.deleteById(branch);
	}
}
