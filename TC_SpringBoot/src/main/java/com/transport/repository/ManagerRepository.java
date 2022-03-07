package com.transport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transport.bean.Manager;

public interface ManagerRepository extends JpaRepository<Manager, String>{

}
