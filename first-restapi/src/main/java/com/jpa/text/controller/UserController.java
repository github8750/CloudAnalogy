package com.jpa.text.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.text.entity.User;
import com.jpa.text.service.UserService;

@RestController
@CrossOrigin("*")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/login")
	public Boolean login(@RequestBody User user) {
		System.out.println(user);
		Boolean checkuser = userService.checkuser(user);
		return checkuser;
	}
}
