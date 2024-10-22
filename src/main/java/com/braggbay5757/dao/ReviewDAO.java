package com.braggbay5757.dao;

import java.util.List;

import com.braggbay5757.dao.GenericDAO;
import com.braggbay5757.domain.Review;





public interface ReviewDAO extends GenericDAO<Review, Integer> {
  
	List<Review> findAll();
	






}


