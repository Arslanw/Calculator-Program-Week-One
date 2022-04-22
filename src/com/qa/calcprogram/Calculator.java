package com.qa.calcprogram;
import java.util.Scanner;
public class Calculator {
	public static double result;
	public static double add(double num1, double num2) {
		result = num1 + num2;
		return result;
	}
	public static double sub(double num1, double num2) {
		result = num1 - num2;
		return result;
	}
	public static double multiply(double num1, double num2) {
		result = num1 * num2;
		return result;
	}
	public static double divi(double num1, double num2) {
		result = num1 / num2;
		return result;
	}

}
