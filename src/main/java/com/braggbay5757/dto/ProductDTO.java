package com.braggbay5757.dto;

import java.util.List;
import java.util.Date;
import java.sql.Timestamp;
import java.time.Year;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class ProductDTO {

	private Integer productId;

	private String title;

	private String description;

	private String category;

	private double startPrice;

	private double currentPrice;

	private Date endDate;






}
