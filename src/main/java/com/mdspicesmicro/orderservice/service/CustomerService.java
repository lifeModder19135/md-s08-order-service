package com.mdspicesmicro.orderservice.service;


import org.springframework.stereotype.Service;
import com.mdspicesmicro.orderservice.model.user.Customer;
import lombok.AllArgsConstructor;
import javax.persistence.Id;

@Service
@AllArgsConstructor
public class CustomerService {

	//public CustomerService() {}
	
	public Customer createAndPersistNewCustomer() {
		return null;
		}

	public Customer loadExistingCustomerFromDatabase(int customerId) {
		return null;
		}
}
