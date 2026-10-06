package com.bankflow.customer.dto;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import com.bankflow.customer.enums.CustomerStatus;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class CustomerResponse {

    private UUID id;
    private String customerNumber;
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private LocalDate dateOfBirth;
    private String address;
    private CustomerStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}