package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Repository.example_Repo;
import com.example.demo.model.example;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/example")
@CrossOrigin("http://localhost:8082/example/new")
public class example_Controller {
	
	@Autowired
	private example_Repo exam_Repo;
	
	@PostMapping("/new")
	public Mono<example> createAccount(@RequestBody example exam) {
		return exam_Repo.save(exam);
	}

}
