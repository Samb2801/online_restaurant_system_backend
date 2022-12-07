package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.demo.model.Add_User;



public interface Add_User_Repo extends ReactiveMongoRepository<Add_User, Integer>{
}
