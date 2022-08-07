package com.example.hw2new.controller;

import com.example.hw2new.model.Order;
import com.example.hw2new.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hw2/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping()
    public List<Order> getAllUsers() {
        List<Order> ordeerList = this.orderService.getAllUsers();
        return ordeerList;
    }

    @GetMapping("/{seq}")
    public Order getOrderMyId(@PathVariable int seq) {
        Order getOrderMyId = this.orderService.getOrderMyId(seq);
        return getOrderMyId;
    }

    @PostMapping()
    public Order createOrder(@RequestBody Order order) {
        Order createOrder = this.orderService.createOrder(order);
        return createOrder;
    }

    @PutMapping("/{seq}")
    public Order updateOrder(@PathVariable int seq,@RequestBody Order order) {
        Order updatedOrder = this.orderService.updateOrder(seq,order);
        return updatedOrder;
    }

    @DeleteMapping("/{seq}")
    public Order deleteOrder(@PathVariable int seq) {
        Order deleteOrder = this.orderService.deleteOrder(seq);
        return deleteOrder;
    }
} // Class end
