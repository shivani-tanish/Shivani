package com.example.rest.templte.webservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.templte.webservices.dto.Product;
import com.example.rest.templte.webservices.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public Product productById(Long product_id) {
		return 	productRepository.findById(product_id).orElse(null);
	}

	public void deleteProductById(long deleteId) {
		productRepository.deleteById(deleteId);
	}

	public Product saveProduct(Product product) {
		return product;

	}


}
