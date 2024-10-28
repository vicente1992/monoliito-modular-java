package com.monolito.modular.modules.customer.application.mappers;

import org.mapstruct.Mapper;

import com.monolito.modular.modules.customer.domain.dtos.CustomerDTO;
import com.monolito.modular.modules.customer.domain.entities.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

  CustomerDTO toDto(Customer customer);

  Customer toEntity(CustomerDTO dto);
}