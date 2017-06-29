package com.customer.bo.impl;

import com.customer.bo.CustomerBo;

public class CustomerBoImpl implements CustomerBo {

	public void addCustomer(){
		TestCust test = new TestCust();
		System.out.println("addCustomer() is running ");
		TestCust.addCustomer3();
	}

	public void addCustomer2(){
		System.out.println("addCustomer2() is running ");
	}
	
	public String addCustomerReturnValue(){
		System.out.println("addCustomerReturnValue() is running ");
		return "abc";
	}

	public void addCustomerThrowException() throws Exception {
		System.out.println("addCustomerThrowException() is running ");
		throw new Exception("Generic Error");
	}

	public void addCustomerAround(String name){
		System.out.println("addCustomerAround() is running, args : " + name);
	}
}