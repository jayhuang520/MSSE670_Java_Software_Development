/**
 * 
 */
package com.HuangsHotelReservation.model.domain;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * @author Jay Huang
 *
 */
public class CustomerTest extends TestCase{
	
	private Customer cus1,cus2,cus3;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		cus1 = new Customer("Alexander","John","JAlexander",
				"password", "email@harris.com", "123-456-7890",
				"10-111-0000");
		cus2 = new Customer("Huang","Jay","JHuang",
				"password", "email@harris.com", "103-456-7890",
				"10-111-2222");
		cus3 = new Customer("Huang","Jay","JHuang",
				"password", "email@harris.com", "103-456-7890",
				"10-111-2222");
	}

	/**
	 * Test method for 
	 * {@link com.HuangsHotelReservation.model.domain.Customer#validate()}}.
	 */
	@Test
	public void testValidateCustomer() {
		System.out.println("Start the testValidateCustomer: ");
		/*
		 * validate method from cus1 should assert to true because
		 * all variables being passed to create a new customer is valid.
		 */
		assertTrue(cus1.validate());
		System.out.println("testValidateCustomer PASSED!!!!");
	}
	
	@Test
	public void testEqualCustomer() {
		System.out.println("Start the testEqualCustomer: ");
		assertTrue(cus2.equals(cus3));
		System.out.println("testEqualCustomer has PASSED!!!");
	}

}
