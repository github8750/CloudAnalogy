package com.jpa.text.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.text.dao.UserRepo;
import com.jpa.text.entity.User;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	public Boolean checkuser(User user) {
		Optional<User> Useroption = userRepo.findById(user.getUsername());

		if (Useroption.isPresent()) {
			return true;
		}
		return false;
	}

}
