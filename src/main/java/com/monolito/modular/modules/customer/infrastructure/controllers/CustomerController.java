package com.monolito.modular.modules.customer.infrastructure.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monolito.modular.modules.customer.application.usecases.CreateCustomerUseCase;
import com.monolito.modular.modules.customer.application.usecases.GetAllCustomersUseCase;
import com.monolito.modular.modules.customer.domain.dtos.CustomerDTO;
import com.monolito.modular.modules.customer.domain.entities.Customer;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping; 


@RestController
@RequestMapping("/customers")
public class CustomerController {

  private final CreateCustomerUseCase createCustomerUseCase;
  private final GetAllCustomersUseCase getAllCustomersUseCase;

  public CustomerController(CreateCustomerUseCase createCustomerUseCase, GetAllCustomersUseCase getAllCustomersUseCase) {
    this.createCustomerUseCase = createCustomerUseCase;
    this.getAllCustomersUseCase = getAllCustomersUseCase;
  }

  @GetMapping 
  public List<CustomerDTO> getAll( ) {
      return getAllCustomersUseCase.execute();
  }
  

  @PostMapping
  public Customer create(@RequestBody  CustomerDTO customerDTO) {
   return createCustomerUseCase.execute(customerDTO);
  }

}
