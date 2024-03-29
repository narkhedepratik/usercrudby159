package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.User;
import com.cjc.main.service.userService;

@RestController
public class UserController {

	@Autowired
	private userService userservice;
	
	@PostMapping("/user")
	public ResponseEntity saveUser(@RequestBody User u)
	{
		userservice.saveData(u);
		
		return new ResponseEntity(HttpStatus.CREATED);
		
	}

	 
	 @GetMapping("/searchbyemail/{email}")
	    public ResponseEntity<User> searchUserbyemail(@PathVariable String email){
	   
	    	User u=userservice.searchUserbyemail(email);
			return new ResponseEntity<User>(u ,HttpStatus.OK);
	    	
	    }

	@GetMapping("/users")
	public ResponseEntity<List<User>> Exposeproduct()
	{
	 List<User> products=userservice.getAllproducts();
	 return new ResponseEntity<List<User>>(products,HttpStatus.OK);
	}

	
	@GetMapping("user/{userid}")
	public User getSingleUser(@PathVariable("userid") int userid)
	{
		User u = userservice.getSingleData(userid);
		
		
		return u;
		
	}

}
