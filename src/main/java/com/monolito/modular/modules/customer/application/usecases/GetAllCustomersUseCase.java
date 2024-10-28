package com.monolito.modular.modules.customer.application.usecases;

import java.util.List;

import org.springframework.stereotype.Service;

import com.monolito.modular.modules.customer.application.mappers.CustomerMapper;
import com.monolito.modular.modules.customer.domain.dtos.CustomerDTO;
import com.monolito.modular.modules.customer.domain.services.CustomerService;

@Service
public class GetAllCustomersUseCase {
  private final CustomerService service;
    private final CustomerMapper mapper;

  public GetAllCustomersUseCase(CustomerService service, CustomerMapper mapper) {
    this.service = service;
    this.mapper = mapper;
  }

  public List<CustomerDTO> execute() {
    return service.findAll().stream().map(mapper::toDto).toList();
  }
}
