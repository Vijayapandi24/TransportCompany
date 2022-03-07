package com.transport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transport.bean.Truck;

public interface TruckRepository extends JpaRepository<Truck, String>{

}
