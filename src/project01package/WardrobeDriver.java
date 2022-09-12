package project01package;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WardrobeDriver {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		userDefinedShirt(console);
		
	}

	
	public static void userDefinedPants(Scanner console) throws InputMismatchException {
		
		String color = "none";
		int price = 0;
//		Condition condition;
//		String condStr;
		int waist = 1;
		int inseam = 1;
		
		Pants pants = new Pants(color, price, Condition.NEW, waist, inseam);
		
		try {
			// COLOR
			System.out.println("What color are the pants?");
			color = console.next();
			pants.setColor(color);
			
			// PRICE
			System.out.println("How much did the pants cost (in USD), rounded to the nearest dollar?");
			price = console.nextInt();
			pants.setPrice(price);
			
			// CONDITION
			// TODO ///////////////////////////////////////
//			System.out.println("I'm not sure how to get the condition");
			
			
			// WAIST
			System.out.println("What is the waist size (in inches)?");
			waist = console.nextInt();
			pants.setWaist(waist);			
			
			// INSEAM
			System.out.println("What is the inseam length (in inches)?");
			inseam = console.nextInt();
			pants.setInseam(inseam);
			
			// SHIRT TEXT
//			System.out.println("What does the text on the shirt say?");
//			text = console.next();
			
			// SIZE
			// TODO ///////////////////////////////////////
//			System.out.println("I'm not sure how to get enum sizes");
			
		} catch (InputMismatchException e) {
			System.out.println("Exception thrown: " + e);
		}
		
		pants.print();
		pants.printJSON();
	}
	
	
	public static void userDefinedShirt(Scanner console) throws InputMismatchException {
		
		String color = "none";
		int price = 0;
//		Condition condition;
//		Size size;
		String shirtText;
		
		Shirt shirt = new Shirt(color, price, Condition.NEW, Size.S);
		
		try {
			// COLOR
			System.out.println("What color is the shirt?");
			color = console.next();
			shirt.setColor(color);
			
			// PRICE
			System.out.println("How much did the shirt cost (in USD), rounded to the nearest dollar?");
			price = console.nextInt();
			shirt.setPrice(price);
			
			// CONDITION
			// TODO ///////////////////////////////////////
//			System.out.println("I'm not sure how to get the condition");
			
			// SHIRT TEXT
			System.out.println("What does the text on the shirt say?");
			shirtText = console.next();
			shirt.setShirtText(shirtText);
			
			// SIZE
			// TODO ///////////////////////////////////////
//			System.out.println("I'm not sure how to get enum sizes");
			
		} catch (InputMismatchException e) {
			System.out.println("Exception thrown: " + e);
		} finally {
			System.out.println("\n===========================\n");
		}
		
		shirt.print();
		shirt.printJSON();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void project1() {
		// Caleb's swing dancing attire:
//		Apparel socks = new Apparel("white", 2, Condition.POOR);
//		Apparel blackVans = new Apparel("black", 70, Condition.POOR);
		Pants jeans = new Pants("dark blue", 32, Condition.GOOD, 32, 32);
		Shirt whiteTank = new Shirt("white", 3, Condition.NEW, Size.M);
		Shirt blueShirt = new Shirt("blue", 18, Condition.GOOD, Size.M);
		Shirt grayVest = new Shirt("gray", 45, Condition.NEW, Size.M);

		// 2 other random articles of clothing (to show that the shirt text works
		Shirt redShirt = new Shirt("red", 25, Condition.POOR, Size.XL, "My dog ate my homework!");
		Pants snazzyPants = new Pants("glittery green", 3500, Condition.NEW, 36, 32);

		// Printing the plain English sentences
		System.out.println("#------------------------------------------#");
		System.out.println("| Caleb's swing dancing attire :           |");
		System.out.println("#------------------------------------------#");
//		socks.print();
//		blackVans.print();
		jeans.print();
		whiteTank.print();
		blueShirt.print();
		grayVest.print();
		System.out.println();
		
		// Printing the JSON data for the same outfit
		System.out.println("#------------------------------------------#");
		System.out.println("| Caleb's swing dancing attire in JSON :   |");
		System.out.println("#------------------------------------------#");
//		socks.printJSON();
//		blackVans.printJSON();
		jeans.printJSON();
		whiteTank.printJSON();
		blueShirt.printJSON();
		grayVest.printJSON();
		System.out.println();

		// Showing off the shirt text feature
		System.out.println("#------------------------------------------#");
		System.out.println("| Proof that the shirt text thing works :  |");
		System.out.println("#------------------------------------------#");
		redShirt.print();
		snazzyPants.print();
		System.out.println();
		
		// Shirt text and snazzy pants in JSON form
		System.out.println("#------------------------------------------#");
		System.out.println("| Shirt text thing in JSON form :          |");
		System.out.println("#------------------------------------------#");
		redShirt.printJSON();
		snazzyPants.printJSON();
		System.out.println();
	}
	
	public static void project2() {
		Shirt whiteTank = new Shirt("white", 3, Condition.NEW, Size.M);
		Shirt blueShirt = new Shirt("blue", 18, Condition.GOOD, Size.M);
		Shirt greenTank = new Shirt("green", 6, Condition.POOR, Size.M);
		Shirt redVNeck = new Shirt("red", 5, Condition.TRASHED, Size.S);
		
		Shirt grayVNeck = new Shirt("gray", 4, Condition.NEW, Size.L);
		Shirt blackShirt = new Shirt("black", 8, Condition.GOOD, Size.M);
		Shirt hawaiian = new Shirt("colorful", 2, Condition.POOR, Size.M);
		Shirt brownTank = new Shirt("brown", 11, Condition.NEW, Size.S);
		
		System.out.println("whiteTank condition: " + whiteTank.getCondition() + " : " + whiteTank.getConditionDecimal());
		System.out.println("blueShirt condition: " + blueShirt.getCondition() + " : " + blueShirt.getConditionDecimal());
		System.out.println("greenTank condition: " + greenTank.getCondition() + " : " + greenTank.getConditionDecimal());
		System.out.println("redVNeck condition: " + redVNeck.getCondition() + " : " + redVNeck.getConditionDecimal());
		
		System.out.println(whiteTank.compareTo(grayVNeck));
		System.out.println(whiteTank.compareTo(blackShirt));
		System.out.println(whiteTank.compareTo(hawaiian));
		System.out.println(whiteTank.compareTo(brownTank));
	}
}
