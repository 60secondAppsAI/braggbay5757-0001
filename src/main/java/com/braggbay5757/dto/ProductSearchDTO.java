package com.braggbay5757.dto;

import java.sql.Timestamp;
import java.time.Year;
import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductSearchDTO {

	private Integer page = 0;
	private Integer size;
	private String sortBy;
	private String sortOrder;
	private String searchQuery;

	private Integer productId;
	
	private String title;
	
	private String description;
	
	private String category;
	
	private double startPrice;
	
	private double currentPrice;
	
	private Date endDate;
	
}
