package com.fssa.bharu.day18.solved;

/**
 * Validation Util for validating specific fields
 * 
 * @param age
 * @return
 */
public class ValidationUtil {
	public static boolean validateAge(int age) throws IllegalArgumentException {
		if (age <= 0) {// Check if the age is a posotive value
			throw new IllegalArgumentException("Invalid age");

		} else {
			return true;
		}
	}
}
