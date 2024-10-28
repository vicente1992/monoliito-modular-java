package com.monolito.modular.modules.customer.application.usecases;

import org.springframework.stereotype.Service;

import com.monolito.modular.modules.customer.application.mappers.CustomerMapper;
import com.monolito.modular.modules.customer.domain.dtos.CustomerDTO;
import com.monolito.modular.modules.customer.domain.entities.Customer;
import com.monolito.modular.modules.customer.domain.services.CustomerService;

@Service
public class CreateCustomerUseCase {

  private final CustomerService service;
  private final CustomerMapper mapper;

  public CreateCustomerUseCase(CustomerService service, CustomerMapper mapper) {
    this.service = service;
    this.mapper = mapper;
  }

  public Customer  execute(CustomerDTO customerDTO) {
   return service.create(mapper.toEntity(customerDTO));
  }
}
