package com.aspect.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.customer.bo.CustomerBo;

public class Test {

	public static void main(String[] args) {
	        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Customer.xml");  
	        CustomerBo customer = (CustomerBo) context.getBean("customerBo");
	        customer.addCustomer();
	        customer.addCustomer2();
	        System.out.println("calling validate...");  
	}
}
