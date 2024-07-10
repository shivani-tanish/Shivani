package com.example.rest.templte.webservices.dto;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;


@Entity
@Data
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long order_id;
	@ManyToMany
	@JoinTable(name="order_products",joinColumns = @JoinColumn(name= "order_id"),
	inverseJoinColumns=@JoinColumn(name="product_id"))

	private List<Product> products;

}
