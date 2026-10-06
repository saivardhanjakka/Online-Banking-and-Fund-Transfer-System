package com.bankflow.customer.service;


import java.util.UUID;

import com.bankflow.customer.dto.CustomerRequest;
import com.bankflow.customer.dto.CustomerResponse;

public interface CustomerService {
	
	public CustomerResponse createCustomer(CustomerRequest request);
	
	public CustomerResponse getCustomerById(UUID id);

}
