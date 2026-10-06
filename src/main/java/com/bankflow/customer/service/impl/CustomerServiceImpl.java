package com.bankflow.customer.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankflow.customer.dto.CustomerRequest;
import com.bankflow.customer.dto.CustomerResponse;
import com.bankflow.customer.entity.Customer;
import com.bankflow.customer.enums.CustomerStatus;
import com.bankflow.customer.mapper.CustomerMapper;
import com.bankflow.customer.repository.CustomerRepository;
import com.bankflow.customer.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {
	
	private final CustomerRepository customerRepository;
	private final CustomerMapper customerMapper;
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
		this.customerRepository = customerRepository;
		this.customerMapper = customerMapper;
	}

	@Override
	public CustomerResponse createCustomer(CustomerRequest request) {
		
		Customer customer =customerMapper.toEntity(request);
		customer.setCustomerNumber(generateCustomerNumber());
		customer.setStatus(CustomerStatus.PENDING_KYC);
		Customer savedCustomer = customerRepository.save(customer);
	
		return customerMapper.toResponse(savedCustomer);
	}

	private String generateCustomerNumber() {
		
		return "Cust" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
	}

	@Override
	public CustomerResponse getCustomerById(UUID id) {
		
		Customer customer = customerRepository.findById(id).orElseThrow(()->new RuntimeException("Customer not found with id: " + id));

		return customerMapper.toResponse(customer);
	}

}
