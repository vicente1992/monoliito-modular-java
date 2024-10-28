package com.monolito.modular.modules.customer.infrastructure.repositories.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monolito.modular.modules.customer.domain.entities.Customer;

public interface SpringDataCustomerRepository extends JpaRepository<Customer, String> {

}
