package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection ="order Details")
public class Order_food {

	@Id
	private String firstName;
	private String Menu1;
	private String Menu2;
	private String Menu3;
	private int total;
	private int phoneNumber;
	
	public static boolean existsById(int phoneNumber) {
		// TODO Auto-generated method stub
		return false;
	}
}
