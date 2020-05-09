package com.javaspring.SimpleJdbcApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaspring.SimpleJdbcApp.repository.UserRepository;

@RestController
@RequestMapping(path="/user")
public class UserControll {

	@Autowired//use for repository
	UserRepository userRepository;
	@GetMapping
	public String check()
	{
		return"Welcome to java Inspires";
	}
	
	@GetMapping(path="/getusernames")
	public List<String> getAllUserNames()
	{
		return userRepository.getAllUserNames();
	}
}
