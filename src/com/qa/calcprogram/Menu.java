package com.qa.calcprogram;
import java.util.Scanner;

public class Menu {
	Scanner enter = new Scanner(System.in); 
	
	public void mainMenu() {
		int num1;
		int num2;
		boolean showMenu = true;
		int menuOption;
		
		System.out.println("This is the Calculator app");
		
		while(showMenu) {
			System.out.println("Select an option from below");
			System.out.println("1 = Addition");
			System.out.println("2 = Subtraction");
			System.out.println("3 = Multiplication");
			System.out.println("4 = Division");
			System.out.println("0 to Exit");
			
			menuOption = this.enter.nextInt();
			
			switch(menuOption) {
			case 1:
			System.out.println("Please enter your first number");
			num1 = enter.nextInt();
			System.out.println("Please enter your second number");
			num2 = enter.nextInt();
			enter.nextLine();
			System.out.println("Your answer is " + Calculator.add(num1, num2));
			break;
			case 2:
				System.out.println("Please enter your first number");
				num1 = enter.nextInt();
				System.out.println("Please enter your second number");
				num2 = enter.nextInt();
				enter.nextLine();
				System.out.println("Your answer is " + Calculator.sub(num1, num2));
				break;
			case 3:
				System.out.println("Please enter your first number");
				num1 = enter.nextInt();
				System.out.println("Please enter your second number");
				num2 = enter.nextInt();
				enter.nextLine();
				System.out.println("Your answer is " + Calculator.multiply(num1, num2));
				break;
			case 4:
				System.out.println("Please enter your first number");
				num1 = enter.nextInt();
				System.out.println("Please enter your second number");
				num2 = enter.nextInt();
				enter.nextLine();
				System.out.println("Your answer is " + Calculator.divi(num1, num2));
				break;
			case 0:
				showMenu = false;
				System.out.println("You have closed the app");
				break;
			default:
				System.out.println("Please try again and select a valid option");
				break;
			}
							
		}
	}
	
}
