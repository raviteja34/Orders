package com.store.orders.controller;

import com.store.orders.model.Customer;
import com.store.orders.model.Product;
import com.store.orders.servers.MiddleWareServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/middleware/")
@CrossOrigin
public class MiddleWareController {

    @Autowired
    private MiddleWareServices middleWareServices;

    @GetMapping("products")
    public ResponseEntity<List<Product>> allProducts(){
        return new ResponseEntity<>(middleWareServices.allProducts(), HttpStatus.OK);
    }
    @PostMapping("product")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
      return new ResponseEntity(middleWareServices.saveProduct(product),HttpStatus.OK);
    }

    @GetMapping("customers")
    public ResponseEntity<List<Customer>> allCustomers(){
        return new ResponseEntity<>(middleWareServices.allCustomers(), HttpStatus.OK);
    }
    @PostMapping("customer")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        return new ResponseEntity<>(middleWareServices.saveCustomer(customer),HttpStatus.OK);
    }
}
