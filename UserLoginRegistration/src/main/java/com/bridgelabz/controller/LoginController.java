package com.bridgelabz.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.service.UserService;


@RestController
public class LoginController {
@Autowired
	
	UserService userservice;
	
	    @RequestMapping(value = "/login", method = RequestMethod.GET)
	    public String getUserByPassword(@PathVariable String password, String userName)
	    {
	        boolean result= userservice.existsById(password);
	        boolean result1= userservice.existsById(userName);
	        
	        if(result&result1) {
	        	return "WELCOME" +userName;
	        	
	        }
	        else
	        	return "INVALID USER";
	    }
	   
}
	    
