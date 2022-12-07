package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



import lombok.Data;
@Data
@Document(collection ="User Details")
public class Add_User {
	
	@Id
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private int phoneNumber;
	public static boolean existsById(int phoneNumber) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
