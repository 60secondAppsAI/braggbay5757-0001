package com.braggbay5757.dao;

import java.util.List;

import com.braggbay5757.dao.GenericDAO;
import com.braggbay5757.domain.Order;





public interface OrderDAO extends GenericDAO<Order, Integer> {
  
	List<Order> findAll();
	






}


