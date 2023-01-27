package com.fanshawe.MyOOPApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyOopApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MyOopApplication.class, args);
		
		// customer 1
		Account cust_1 = new Account();
		
		cust_1.deposit(500);
		
		// customer 2
		Account cust_2 = new Account();
		
		cust_2.deposit(350);
		
		cust_2.withdrawal(100);
		
		System.out.println("Customer 1 balance: ");
		System.out.println(cust_1.getBalance());
		
		System.out.println("Customer 2 balance: ");
		System.out.println(cust_2.getBalance());
	}

}
