package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.Order_Food_Repo;
import com.example.demo.model.Order_food;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/order")
public class order_controller {
	
	@Autowired
	private Order_Food_Repo Food_Repo;
	
	@PostMapping("/OrderDetails")
	public Mono<Order_food> OrderDetails(@RequestBody Order_food user1) {
		return Food_Repo.save(user1);
	}
	
	@PutMapping("/Update")
	public Mono<Order_food> UpdateDetails(@RequestBody Order_food user1) {
			return Food_Repo.save(user1);
		}
	
	 @GetMapping("/getOrder")
	    public Flux<Order_food> getAllUsers() {
	        
	        return  Food_Repo.findAll();
	    }
	
	
}
