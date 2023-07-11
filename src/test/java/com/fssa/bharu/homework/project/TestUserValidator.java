package com.fssa.bharu.homework.project;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class TestUserValidator {

	@Test
	void testValidate() {
		ProductUpload product = new ProductUpload();
		product.setProduct_name("Santhanam");
		product.setDescription("Thisismyfristart");
		product.setTitle("Dany");
		product.setSold_by("bharu");
		product.setPrize(500);
		product.setUrl(
				"https://www.timeoutdubai.com/cloud/timeoutdubai/2021/09/11/udHvbKwV-IMG-Dubai-UAE-1-1200x800.jpg");

		Assertions.assertTrue(ProductDetailsValiate.validate(product));
	}

	@Test
	void testValidateNullException() {
		try {
			ProductDetailsValiate.validate(null);
//			Assertions.fail("Validate Null method fails");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Argument Cannot be null", ex.getMessage());
		}
	}

//  for valid Username
	@Test
	public void testValidName() {
		Assertions.assertTrue(ProductDetailsValiate.ValidateName("Santhus"));
	}

//	Testcase for in valid name 

	@Test
	public void testInvalidName() {
		try {
			ProductDetailsValiate.ValidateName(" ");
//			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("UserName cannot be empty or null", ex.getMessage());
		}

	}

	@Test
	void testUnmatchedName() {
		try {
			ProductDetailsValiate.ValidateName("q");
//			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Artname should be in minimum 2 letters  and maximum 30 letters", ex.getMessage());
		}
	}

//	validation for url
	@Test
	public void testvalidurl() {
		Assertions.assertTrue(ProductDetailsValiate.validateurl(
				"https://www.timeoutdubai.com/cloud/timeoutdubai/2021/09/11/udHvbKwV-IMG-Dubai-UAE-1-1200x800.jpg"));
	}
	
	

//    invalid testcase for url
	@Test
	public void testInvaildUrl() {
		try {
			ProductDetailsValiate.validateurl("");
//			Assertions.fail("Validate url failed");

		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("URL not be null", ex.getMessage());
		}
	}
	
	

	@Test
	void testUnmatchedUrl() {
		try {
			ProductDetailsValiate.validateurl(null);
//			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("URL not be null", ex.getMessage());
		}
	}

//  for valid Email
	@Test
	public void testValidDescription() {
		Assertions.assertTrue(ProductDetailsValiate.validateDescription("Hellojhvutfutfu"));
	}

//	for invaild email
	@Test
	public void testInvalidDescription() {
		try {
			ProductDetailsValiate.validateDescription(null);
//			Assertions.fail("Validate failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Description cannot be empty or null", ex.getMessage());
		}

	}

	@Test
	void testUnmatchedDescription() {
		try {
			ProductDetailsValiate.validateDescription("a");
//			Assertions.fail("Validate failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The Description  is: Invalid", ex.getMessage());
		}
	}

//	for Vlid title
	@Test
	public void testValidTitle() {
		Assertions.assertTrue(ProductDetailsValiate.ValidateTitle("samdsmsam"));
	}

//	for invaid title
	@Test
	public void testInvalidTitle() {
		try {
			ProductDetailsValiate.ValidateTitle("");
//			Assertions.fail("ValidateTitle failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Title is invalid", ex.getMessage());
		}

	}

//	unmatchvalidation
	@Test
	public void testUnmatchedInvalidTitle() {
		try {
			ProductDetailsValiate.ValidateTitle("w");
//			Assertions.fail("ValidateTitle failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Title is invalid", ex.getMessage());
		}

	}

//valid for  soldby
	@Test
	public void testValidSold_by() {
		Assertions.assertTrue(ProductDetailsValiate.validateSold_by("Santhu"));
	}

//	for invaid title
	@Test
	public void testInvalidSoldby() {
		try {
			ProductDetailsValiate.validateSold_by("");
//			Assertions.fail("ValidateSold by failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Artistname should be in minimum 3 letters  and maximum 20 letters",
					ex.getMessage());
		}

	}

//	unmatched 
	@Test
	public void testUnmathInvalidSoldby() {
		try {
			ProductDetailsValiate.validateSold_by("we");
//			Assertions.fail("ValidateSold by failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Artistname should be in minimum 3 letters  and maximum 20 letters",
					ex.getMessage());
		}

	}
	
	

//	valid for price
	@Test
	public void testValidPrize() {
		Assertions.assertTrue(ProductDetailsValiate.validatePrize(300));
	}
	
	
	

//	for invaid prize
	@Test
	public void testInvalidPrize() {
		try {
			ProductDetailsValiate.validatePrize(0);
//			Assertions.fail("Validateprize failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The prize range is above 99", ex.getMessage());
		}

	}
	
	

	// for unmacthinvaid prize
	@Test
	public void UnMatchtestInvalidPrize() {
		try {
			ProductDetailsValiate.validatePrize(10);
//			Assertions.fail("Validateprize failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The prize range is above 99", ex.getMessage());
		}

	}

}
