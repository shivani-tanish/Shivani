package com.example.rest.templte.webservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.templte.webservices.dto.Order;
import com.example.rest.templte.webservices.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public List<Order> getAllOrders(){
		return orderRepository.findAll();
	}

	public Order saveOrders(Order order) {
		return orderRepository.save(order);
	}

	public void deleteOrders(Long id) {
		orderRepository.deleteById(id);
	}

	public Order getOrderById(long order_id) {
		return orderRepository.findById(order_id).orElse(null);
	}
}
