package com.geekster.EcommerceApplication.Service;

import com.geekster.EcommerceApplication.Model.Address;
import com.geekster.EcommerceApplication.Model.Order;
import com.geekster.EcommerceApplication.Model.Product;
import com.geekster.EcommerceApplication.Model.User;
import com.geekster.EcommerceApplication.Repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    IOrderRepository orderRepository;

    public String addAllOrder(Order order) {
        if(order.getUser()==null || order.getProduct() ==null || order.getAddress()==null){
            orderRepository.save(order);
            return "Order is not placed....!!";
        }
        orderRepository.save(order);
        return "Order Placed successfully....!!!";
    }

    public List<Order> getOrderById(Iterable<Long> orderId) {
        return orderRepository.findAllById(orderId);
    }
}
