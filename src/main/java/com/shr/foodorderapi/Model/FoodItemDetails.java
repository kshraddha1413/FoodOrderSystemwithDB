package com.shr.foodorderapi.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "fooditems")
public class FoodItemDetails {
	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String type;
	@Column
	private String name;
	@Column
	private Double price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "FoodItemDetails [id=" + id + ", type=" + type + ", name=" + name + ", price=" + price + "]";
	}
	
	
	}
	
	
	
/*
use food;
CREATE TABLE fooditems
(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    	fooditemtype VARCHAR(255),
    	fooditemname VARCHAR(255)
);
select * from fooditems;
DROP table fooditems;

	*/
	

