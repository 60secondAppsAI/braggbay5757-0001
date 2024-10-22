package com.braggbay5757.dao;

import java.util.List;

import com.braggbay5757.dao.GenericDAO;
import com.braggbay5757.domain.User;

import java.util.Optional;




public interface UserDAO extends GenericDAO<User, Integer> {
  
	List<User> findAll();
	






}


