package com.bankflow.customer.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankflow.customer.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, UUID> {

}
