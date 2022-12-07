package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Repository.Add_User_Repo;

import com.example.demo.model.Add_User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/User")
@CrossOrigin("*")
public class user_controller {
	@Autowired
	private Add_User_Repo USER_Repo;
	
	
	

	
	//Create New Account
		@PostMapping("/createAccount")
		public Mono<Add_User> createAccount(@RequestBody Add_User user) {
			return USER_Repo.save(user);
		}
		
		@GetMapping("/ViewUser/{phoneNumber}")
		public Mono<Add_User> getfname(@PathVariable int phoneNumber) {
			return USER_Repo.findById(phoneNumber);
		}
		
		@DeleteMapping("/deleteAccountById/Userphone:{phoneNumber}")
		public Mono<Void> deletebyId(@PathVariable int phoneNumber) {
			return USER_Repo.deleteById(phoneNumber);

		}
		
		 @GetMapping("/getUser")
		    public Flux<Add_User> getAllUsers() {
		        
		        return  USER_Repo.findAll();
		    }
		
		
		
//		@GetMapping("/login/email:{email}/pass:{password}")
//		public Mono<login> loginUser(@PathVariable String email, @PathVariable String password)
//				 {
//			USER_Repo.findAll().filter(user -> user.getEmail().equals(email)).doOnNext(user -> {
//				if (user.getPassword() == password) {
//					System.out.println(user);
//				} else {
//					System.out.println("You Enter Wrong credentials");
//				}
//			}).flatMap(USER_Repo::save).blockFirst();
//
//			return Login_Repo.saveAll(" Login successfully");
//
//		}



}
