package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Item1;
import com.example.demo.service.Item1Service;

@RestController
public class Item1Controller {
	
	@Autowired
	public Item1Service us;
	
	@PostMapping("/addud")
	public Item1 regItem1(@RequestBody Item1 ud) {
		return us.addItem1(ud);
	}
	
	@GetMapping("/getud")
	public List<Item1> getUs(){
		return us.getItem1();
	}
	
	@DeleteMapping("/deleteud/{id1}")
	public void deleteItem1(@PathVariable("id1") Integer id1) {
	    us.deleteItem1(id1);
	}
	
	@PutMapping("/updateud")
	public Item1 updateItem1(@RequestBody Item1 ud) {
		return us.updateItem1(ud);
	}

}
