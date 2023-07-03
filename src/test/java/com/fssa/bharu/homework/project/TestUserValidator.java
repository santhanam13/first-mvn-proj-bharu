package com.fssa.bharu.homework.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestUserValidator {
//  for valid Username
	@Test
	public void testValidName() {
		Assertions.assertTrue(UserDetailsValidator.ValidateName("Santhus"));
	}
//  for valid Email
	@Test
	public void testValidEmail() {
		Assertions.assertTrue(UserDetailsValidator.validateEmail("Santhanam@gmail.com"));
	}
	@Test
	public void testValidPhoneNumber() {
		Assertions.assertTrue(UserDetailsValidator.validatePhoneNumber("9095297688"));
	}
	@Test
	public void testValidPinCode() {
		Assertions.assertTrue(UserDetailsValidator.validatePinCode("6021211"));
	}
	@Test
	public void testValidPlace() {
		Assertions.assertTrue(UserDetailsValidator.validatePlace("Tirunelveli"));
	}
	@Test
	public void testValidPassword() {
		Assertions.assertTrue(UserDetailsValidator.validatePassword("Santhuq2r4#17"));
	}
}