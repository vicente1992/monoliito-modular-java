package com.monolito.modular.modules.customer.domain.services.interfaces;

import java.util.List;

import com.monolito.modular.modules.customer.domain.entities.Customer;

public interface ICustomerService {
  
  List<Customer> findAll();

  Customer create(Customer customer);

}
