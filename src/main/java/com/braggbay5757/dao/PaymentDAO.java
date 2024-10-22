package com.braggbay5757.dao;

import java.util.List;

import com.braggbay5757.dao.GenericDAO;
import com.braggbay5757.domain.Payment;





public interface PaymentDAO extends GenericDAO<Payment, Integer> {
  
	List<Payment> findAll();
	






}


