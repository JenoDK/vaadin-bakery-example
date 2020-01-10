package com.genohm.jeno.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.genohm.jeno.backend.data.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
