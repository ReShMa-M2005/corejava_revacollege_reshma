package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Item1;

public interface MallRepository extends JpaRepository<Item1,Integer> {
	
	

}
