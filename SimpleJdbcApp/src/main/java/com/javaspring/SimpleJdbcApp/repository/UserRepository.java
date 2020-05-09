package com.javaspring.SimpleJdbcApp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Repository
public class UserRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<String> getAllUserNames() {
         List<String> usernameList = new ArrayList<>();
         
         usernameList.addAll(jdbcTemplate.queryForList("select name from project;",String.class));
         return usernameList;
	}

	
}
