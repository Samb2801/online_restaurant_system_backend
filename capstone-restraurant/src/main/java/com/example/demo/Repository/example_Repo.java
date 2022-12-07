package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


import com.example.demo.model.example;



public interface example_Repo extends ReactiveMongoRepository<example, Integer>{

	

}
