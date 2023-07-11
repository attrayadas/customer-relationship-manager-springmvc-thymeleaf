package com.attraya.service;

import com.attraya.model.Customer;

import java.util.List;

public interface ICustomerService {

    List<Customer> getCustomers();
    void saveCustomer(Customer customer);
    Customer getCustomer(Integer customerId);
    void deleteCustomer(Integer customerId);
}
