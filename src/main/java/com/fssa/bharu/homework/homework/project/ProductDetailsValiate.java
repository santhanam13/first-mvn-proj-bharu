package com.fssa.bharu.homework.project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProductDetailsValiate {
	public static boolean validate(ProductUpload user) {
		if (user == null) {
			throw new IllegalArgumentException("Argument Cannot be null");
		}
		ValidateName(user.product_name);
		validateDescription(user.Description);
		ValidateTitle(user.Title);
		validateSold_by(user.Sold_by);
		validatePrize(user.prize);
//		ValidateName(user.width_height);	
		return true;

	}

	private static void ValidateName(double width_height) {
		// TODO Auto-generated method stub
//		if(width_height == null) || "".equals(width_height)

	}

	// product_name validate
	public static boolean ValidateName(String product_name) throws IllegalArgumentException {
		if (product_name == null || "".equals(product_name.trim())) {
			throw new IllegalArgumentException("UserName cannot be empty or null");
		}

		String nameregex = "^[A-Za-z]{2,30}$";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(product_name);
		Boolean isMatch = matcher.matches();

		if (!isMatch) {
			throw new IllegalArgumentException("Artname should be in minimum 2 letters  and maximum 30 letters");

		}
		return true;

	}

	// Description validate
	public static boolean validateDescription(String Description) throws IllegalArgumentException {
		String regex = "^[A-Za-z]{5,30}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(Description);
		Boolean isMatch = matcher.matches();
		if (isMatch) {
			return true;
		} else {
			throw new IllegalArgumentException("The email address is: Invalid");
		}
	}

	// Title validate
	public static boolean ValidateTitle(String Title) throws IllegalArgumentException {

		if (Title == null || "".equals(Title.trim())) {
			throw new IllegalArgumentException("Title is null?");
		}

		String regex = "^[A-Za-z]{3,10}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(Title);
		Boolean isMatch = matcher.matches();
		if (isMatch) {
			return true;
		} else {
			throw new IllegalArgumentException("Title invaild");
		}
	}

	// Sold_by validate
	public static boolean validateSold_by(String Sold_by) throws IllegalArgumentException {
		if (Sold_by == null || "".equals(Sold_by.trim())) {
			throw new IllegalArgumentException("Place cannot be empty or null");
		}

		String nameregex = "^[A-Za-z]{3,10}$";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(Sold_by);
		Boolean isMatch = matcher.matches();

		if (!isMatch) {
			throw new IllegalArgumentException("Artistname should be in minimum 3 letters  and maximum 20 letters");

		}
		return true;

	}

	// price validate
	public static boolean validatePrize(int prize) throws IllegalArgumentException {
//		String forpattern = Integer.toString(prize);
//		if (forpattern == null || "".equals(forpattern.trim())) {
//			throw new IllegalArgumentException("prize cannot be empty or null");
//		}
//		String passwordregex = "^{3,5}$";
//
//		Pattern pattern = Pattern.compile(passwordregex);
//		Matcher matcher = pattern.matcher(forpattern);
//		Boolean isMatch = matcher.matches();

		if (prize<9999&&prize>99) {
			return true;
		}
		else {
			throw new IllegalArgumentException("The password is invalid");
		}
		 
	}

}