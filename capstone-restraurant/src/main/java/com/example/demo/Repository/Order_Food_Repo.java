package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


import com.example.demo.model.Order_food;



public interface Order_Food_Repo extends ReactiveMongoRepository<Order_food, Integer> {

	

}
