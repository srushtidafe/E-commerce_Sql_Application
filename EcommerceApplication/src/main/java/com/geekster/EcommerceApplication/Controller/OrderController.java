package com.geekster.EcommerceApplication.Controller;

import com.geekster.EcommerceApplication.Model.Order;
import com.geekster.EcommerceApplication.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @GetMapping(value = "Order/Id/{orderId}")
    public List<Order> getOrderById(@PathVariable Iterable<Long> orderId){
        return orderService.getOrderById(orderId);
    }
    @PostMapping(value = "Order")
    public String addAllOrder(@RequestBody Order Order){
        return orderService.addAllOrder(Order);
    }
}
