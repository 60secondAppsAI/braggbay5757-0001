package com.braggbay5757.dao;

import java.util.List;

import com.braggbay5757.dao.GenericDAO;
import com.braggbay5757.domain.Product;





public interface ProductDAO extends GenericDAO<Product, Integer> {
  
	List<Product> findAll();
	






}


