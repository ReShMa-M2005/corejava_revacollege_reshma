package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Item1;
import com.example.demo.repository.MallRepository;

@Service
public class Item1Service {
	
	@Autowired
	public MallRepository marepo;
	
	public Item1 addItem1(Item1 ud) {
		return marepo.save(ud);
	}
	
	public List<Item1>  getItem1(){
		return marepo.findAll();
		
	}
	
	public void deleteItem1(int id1) {
		marepo.deleteById(id1);
	}
	
	public Item1 updateItem1(Item1 ud) {
		Integer id=ud.getId();
		Item1 ud1=marepo.findById(id).get();
		ud1.setName(ud.getName());
		ud1.setManufacturing(ud.getManufacturing());
		ud1.setExpiry(ud.getExpiry());
		ud1.setPrice(ud.getPrice());
		ud1.setCategory(ud.getCategory());
		return marepo.save(ud1);
	}

}
