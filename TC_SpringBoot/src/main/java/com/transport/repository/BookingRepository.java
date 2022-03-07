package com.transport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transport.bean.Booking;

public interface BookingRepository extends JpaRepository<Booking, String>{

}
