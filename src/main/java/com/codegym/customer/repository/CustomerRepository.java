package com.codegym.customer.repository;

import com.codegym.customer.model.Customer;
import com.codegym.customer.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);
}