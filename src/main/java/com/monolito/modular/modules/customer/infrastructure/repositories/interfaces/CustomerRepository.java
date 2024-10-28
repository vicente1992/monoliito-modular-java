package com.monolito.modular.modules.customer.infrastructure.repositories.interfaces;

import java.util.List;

import com.monolito.modular.modules.customer.domain.entities.Customer;

public interface CustomerRepository {

  Customer save(Customer customer);

  List<Customer> findAll();

}
