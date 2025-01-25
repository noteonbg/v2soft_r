package com.poc.springbootjpaexample;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface CUserDao extends JpaRepository<CUser, String> {
	// Cuser is entity classname.
	//String is the data type of the primary key
	//class implementation will be done by spring framewrok..
	
	//spring boot will lcreate the object of the class
	//which implements this interface..
	
	//declare the method..many ways to do it..
	
	List<CUser> findBypincode(int pincode);
	
	//method declaraytion.. who is going to define it..
	

}
