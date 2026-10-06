package com.bankflow.customer.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.bankflow.customer.dto.CustomerRequest;
import com.bankflow.customer.dto.CustomerResponse;
import com.bankflow.customer.entity.Customer;
@Component
public class CustomerMapper {

	private final ModelMapper modelMapper;
	
	public CustomerMapper(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}
	
	public Customer toEntity(CustomerRequest customerRequest) {
		return modelMapper.map(customerRequest, Customer.class);
	}
	
	public CustomerResponse toResponse(Customer customer) {
		return modelMapper.map(customer, CustomerResponse.class);
	}
	
}
