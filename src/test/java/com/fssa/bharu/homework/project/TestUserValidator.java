package com.fssa.bharu.homework.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestUserValidator {
//  for valid Username
	@Test
	public void testValidName() {
		Assertions.assertTrue(ProductDetailsValiate.ValidateName("Santhus"));
	}
	

	@Test
	public void testInvalidName() {
		try {
			ProductDetailsValiate.ValidateName(null);
			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Name cannot be empty or null", ex.getMessage());
		}
		 
	}
 
	
	
	
//  for valid Email
	@Test
	public void testValidDescription() {
		Assertions.assertTrue(ProductDetailsValiate.validateDescription("Hellojhvutfutfu"));
	}
	@Test
	public void testValidTitle() {
		Assertions.assertTrue(ProductDetailsValiate.ValidateTitle("samdsmsam"));
	}
	@Test
	public void testValidSold_by() {
		Assertions.assertTrue(ProductDetailsValiate.validateSold_by("Santhu"));
	}
	@Test
	public void testValidPrize() {
		Assertions.assertTrue(ProductDetailsValiate.validatePrize(300));
	}
	 
}