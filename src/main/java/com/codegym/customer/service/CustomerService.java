package com.codegym.customer.service;

import com.codegym.customer.model.Customer;
import com.codegym.customer.model.Province;

import java.util.List;

public interface CustomerService {
    Iterable<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
    Iterable<Customer> findAllByProvince(Province province);
}
