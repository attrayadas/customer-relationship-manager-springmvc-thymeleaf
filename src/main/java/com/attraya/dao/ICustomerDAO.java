package com.attraya.dao;

import com.attraya.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerDAO extends JpaRepository<Customer, Integer> {
}
