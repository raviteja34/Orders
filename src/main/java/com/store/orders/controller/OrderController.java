package com.store.orders.controller;

import com.store.orders.model.Order;
import com.store.orders.servers.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<List<Order>> saveOrders(@RequestBody Order order){
        orderService.save(order);
        return new ResponseEntity<>(orderService.getAll(), HttpStatus.ACCEPTED);
    }
}
