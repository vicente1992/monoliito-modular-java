package com.monolito.modular.modules.customer.infrastructure.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.monolito.modular.modules.customer.domain.entities.Customer;
import com.monolito.modular.modules.customer.infrastructure.repositories.interfaces.CustomerRepository;
import com.monolito.modular.modules.customer.infrastructure.repositories.interfaces.SpringDataCustomerRepository;

@Repository
public class JpaCustomerRepository  implements CustomerRepository{

  private final SpringDataCustomerRepository repository;

  public JpaCustomerRepository(SpringDataCustomerRepository repository) {
    this.repository = repository;
  }
  @Override
  public Customer save(Customer customer) { 
    return repository.save(customer);
  }

  @Override
  public List<Customer> findAll() {
   return repository.findAll();
  }

}
