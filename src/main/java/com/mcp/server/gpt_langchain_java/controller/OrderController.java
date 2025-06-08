package com.mcp.server.gpt_langchain_java.controller;

import com.mcp.server.gpt_langchain_java.model.Order;
import com.mcp.server.gpt_langchain_java.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderRepository repository;

    @GetMapping
    public List<Order> getAllOrders() {
        return repository.findAll();
    }

    @GetMapping("/customer/{name}")
    public List<Order> getOrdersByCustomer(@PathVariable String name) {
        return repository.findByCustomerName(name);
    }

}
