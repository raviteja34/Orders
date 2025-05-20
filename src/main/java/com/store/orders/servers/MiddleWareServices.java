package com.store.orders.servers;

import com.store.orders.model.Customer;
import com.store.orders.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class MiddleWareServices {

    @Autowired
    private RestClient restClient;


    public List<Product> allProducts() {
      return   restClient.get().uri("http://localhost:8083/product").retrieve().body(List.class);
    }


    public Product saveProduct(Product product) {
        try {
            return restClient.post().uri("http://localhost:8083/product").body(product).retrieve().body(Product.class);
        }catch (Exception ex){
            throw new RuntimeException("error");
        }
    }

    public List<Customer> allCustomers() {
        return   restClient.get().uri("http://localhost:8082/customer").retrieve().body(List.class);
    }


    public Customer saveCustomer(Customer customer) {
        try {
            return restClient.post().uri("http://localhost:8082/customer").body(customer).retrieve().body(Customer.class);
        } catch (Exception ex) {
            throw new RuntimeException("error");
        }
    }
}
