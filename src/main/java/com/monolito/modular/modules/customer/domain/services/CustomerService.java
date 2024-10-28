package com.monolito.modular.modules.customer.domain.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.monolito.modular.modules.customer.domain.entities.Customer;
import com.monolito.modular.modules.customer.domain.services.interfaces.ICustomerService;
import com.monolito.modular.modules.customer.infrastructure.repositories.interfaces.CustomerRepository;

@Service
public class CustomerService implements ICustomerService {

  private final CustomerRepository repository;

  public CustomerService(CustomerRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<Customer> findAll() { 
   return repository.findAll();
  }

  public Customer create(Customer customer) { 
    return repository.save(customer);
  }

  

}
