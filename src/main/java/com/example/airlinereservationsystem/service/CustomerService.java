package com.example.airlinereservationsystem.service;


import com.example.airlinereservationsystem.model.customer.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Optional <Customer> getCustomerById(Long id);
}
