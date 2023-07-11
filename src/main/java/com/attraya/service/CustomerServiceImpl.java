package com.attraya.service;

import com.attraya.dao.ICustomerDAO;
import com.attraya.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements  ICustomerService{

    @Autowired
    private ICustomerDAO repo;

    @Override
    public List<Customer> getCustomers() {
        return repo.findAll();
    }

    @Override
    public void saveCustomer(Customer customer) {
        repo.save(customer);
    }

    @Override
    public Customer getCustomer(Integer customerId) {
        Optional<Customer> optional = repo.findById(customerId);
        return optional.get();
    }

    @Override
    public void deleteCustomer(Integer customerId) {
        repo.deleteById(customerId);
    }
}
