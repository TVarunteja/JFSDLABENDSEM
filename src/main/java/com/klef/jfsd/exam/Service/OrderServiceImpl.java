package com.klef.jfsd.exam.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Order;
import com.klef.jfsd.exam.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order createOrder(Order order) {
        if (order.getOrderId() == null) {
            throw new IllegalArgumentException("Order ID must not be null.");
        }
        return orderRepository.save(order);
    }
}
