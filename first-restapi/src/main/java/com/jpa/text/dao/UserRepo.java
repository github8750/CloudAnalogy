package com.jpa.text.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.text.entity.User;

@Repository
public interface UserRepo extends CrudRepository<User, String>{
	
}
