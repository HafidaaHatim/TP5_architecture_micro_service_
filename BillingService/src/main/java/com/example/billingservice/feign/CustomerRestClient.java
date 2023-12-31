package com.example.billingservice.feign;


import com.example.billingservice.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerRestClient {
    @GetMapping("/customers/{id}?projection=fullCustomer")
    Customer getCustomerById(@PathVariable("id") Long id);
}
