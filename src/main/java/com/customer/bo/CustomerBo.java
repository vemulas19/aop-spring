package com.customer.bo;

public interface CustomerBo {

	void addCustomer();

	void addCustomer2();
	
	String addCustomerReturnValue();

	void addCustomerThrowException() throws Exception;

	void addCustomerAround(String name);
}
