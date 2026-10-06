package com.bankflow.customer.enums;

//Instead of storing random status strings,
//we restrict the customer status to predefined values.
public enum CustomerStatus {
	  PENDING_KYC,
	    ACTIVE,
	    INACTIVE,
	    BLOCKED

}


//PENDING_KYC → Verification is pending
//ACTIVE      → Customer is active
//INACTIVE    → Customer is inactive
//BLOCKED     → Customer is blocked