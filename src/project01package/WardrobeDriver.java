package project01package;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * COS212 Project 2
 * 
 * 
 * @author Nathan Gossett
 * @author Caleb Lent
 * @version year: 2022
 */

public class WardrobeDriver {
	/** Store the list of clothes in the wardrobe */
	private ArrayList<Apparel> myClothes;
	
	
	/**
	 * 
	 */
	public WardrobeDriver() {
		super();
		myClothes = new ArrayList<Apparel>();
	}

	/**
	 * A method to hard-code some example clothes
	 */
	private void populate(){
		Scanner input = new Scanner(System.in);
		
		//TODO Collect price/color until user supplies valid input
		
		// User adds 3 shirts
		int index = 0;
//		while(index < 3) {
//			if(addShirt(input)) {
//				index++;
//			}
//		}
//		index = 0;
		while(index < 3) {
			if(addPants(input)) {
				index++;
			}
		}
//		????
//		myClothes.add(new Shirt(color, price, Condition.NEW, Size.M));
//		????
		
//		myClothes.add(new Shirt("white", 9.99, Condition.POOR, Size.M, ""));
//		myClothes.add(new Pants("blue", 29.99, Condition.NEW, 30, 32));
//		myClothes.add(new Pants("black", 39.99, Condition.TRASHED, 44, 35));
//		myClothes.add(new Pants("khaki", 42.99, Condition.GOOD, 40, 38));
		
		//Your Apparel class should implement Comparable<Apparel> interface, which
		//then makes you compatible with this line.  Uncomment it once you've read
		//this.
		//TODO uncomment the line below
		Collections.sort(myClothes);
	}
	
	/**
	 * Override the default toString to print a list of the clothes
	 * in the wardrobe
	 */
	public String toString(){
		String myString = "";
		for(Apparel a : myClothes){
			myString += a + "\n\n";
		}
		return myString;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String [] args){
		WardrobeDriver myWardrobe = new WardrobeDriver();
		myWardrobe.populate();
		System.out.print(myWardrobe);
		
	}
	
	
	
	
	
	
	
	
	
	public static boolean addShirt(Scanner console) throws InputMismatchException {
		
		String color = "none";
		double price = 0;
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
			price = console.nextDouble();
			shirt.setPrice(price);
			
			// CONDITION
			// TODO ADD
			
			// SHIRT TEXT
			System.out.println("What does the text on the shirt say?");
			shirtText = console.next();
			shirt.setShirtText(shirtText);
			
			// SIZE
			// TODO ADD
			
		} catch (InputMismatchException e) {
			System.out.println("Exception thrown: " + e);
			return false;
		}
		
		return true;
	}
	
	public static boolean addPants(Scanner console) throws InputMismatchException {
		
		String color = "none";
		double price = 0;
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
			System.out.println("How much did the pants cost?");
			price = console.nextDouble();
			pants.setPrice(price);
			
			// CONDITION
			// TODO ADD
			
			// WAIST
			System.out.println("What is the waist size (in inches)?");
			waist = console.nextInt();
			pants.setWaist(waist);			
			
			// INSEAM
			System.out.println("What is the inseam length (in inches)?");
			inseam = console.nextInt();
			pants.setInseam(inseam);
			
		} catch (InputMismatchException e) {
			System.out.println("Exception thrown: " + e);
			return false;
		}
		return true;
	}
	
	
}
	
	
	
	
	
	
	
	
	
 	  
