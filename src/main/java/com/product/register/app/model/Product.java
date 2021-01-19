package com.product.register.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Product {

	@Id
	@JsonIgnore
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="SKU")
	private Long sku;

	@Column(name="NAME")
	private String name;
	
	@Column(name="BRAND")
	private String brand;
	
	@Column(name="SIZE")
	private Integer size;
	
	@Column(name="PRICE")
    private Long price;
    
	@Column(name="PRINCIPAL_IMAGE")
	private String principalImage;
	
	@Column(name="OTHER_IMAGE")
	private String otherImage;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSku() {
		return sku;
	}

	public void setSku(Long sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}
	
	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getPrincipalImage() {
		return principalImage;
	}

	public void setPrincipalImage(String principalImage) {
		this.principalImage = principalImage;
	}

	public String getOtherImage() {
		return otherImage;
	}

	public void setOtherImage(String otherImage) {
		this.otherImage = otherImage;
	}
	
	
	
}
