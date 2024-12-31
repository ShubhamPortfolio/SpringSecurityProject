package com.learning.EazyBankBackendApplication.repository;

import com.learning.EazyBankBackendApplication.Model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Optional<Customer> findByEmail(String email);
}
