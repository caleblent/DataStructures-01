package project01package;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

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
	
	// declare the number of shirts and pants to add
	private final int SHIRT_COUNT = 3;
	private final int PANTS_COUNT = 3;
	
	/**
	 * Constructor function for WardrobeDriver class
	 */
	public WardrobeDriver() {
		super();
		myClothes = new ArrayList<Apparel>();
	}

	/**
	 * BEFORE: A method to hard-code some example clothes
	 * 
	 * NOW: This method allows user to input Apparel objects into myWardrobe
	 */
	private void populate(){
		Scanner input = new Scanner(System.in);
		
		//TODO Collect price/color until user supplies valid input
		
		// User adds 3 shirts - index goes from 0 to 2
		int index = 0;
		while(index < SHIRT_COUNT) {
			// addShirt() method attempts to add a shirt object to the myClothes ArrayList
			// if successful, returns true and the index is incremented
			if(addShirt(input)) {
				index++;
			}
		}
		
		// User adds 3 pairs of pants - reset index to 0
		index = 0;
		while(index < PANTS_COUNT) {
			// addPants() method attempts to add a pants object to the myClothes ArrayList
			// if successful, returns true and the index is incremented
			if(addPants(input)) {
				index++;
			}
		}
		
		// hard-coded Apparel examples for testing purposes
//		myClothes.add(new Shirt("white", 9.99, Condition.POOR, Size.M, ""));
//		myClothes.add(new Pants("blue", 29.99, Condition.NEW, 30, 32));
//		myClothes.add(new Pants("black", 39.99, Condition.TRASHED, 44, 35));
//		myClothes.add(new Pants("khaki", 42.99, Condition.GOOD, 40, 38));
		
		//Your Apparel class should implement Comparable<Apparel> interface, which
		//then makes you compatible with this line.  Uncomment it once you've read
		//this.
		Collections.sort(myClothes);
	}
	
	/**
	 * Override the default toString to print a list of the clothes
	 * in the wardrobe
	 */
	@Override
	public String toString(){
		String myString = "";
		for(Apparel a : myClothes){
			myString += a + "\n\n";
		}
		return myString;
	}

	/**
	 * Main driver method, unaltered from the boiler code state.
	 * 
	 * Initializes myWardrobe as a new WardrobeDriver object, then
	 * calls populate() to fill it with Apparel objects of type 
	 * shirt and pants, then prints it to the console.
	 * 
	 * @param args
	 */
	public static void main(String [] args){
		WardrobeDriver myWardrobe = new WardrobeDriver();
		myWardrobe.populate();
		System.out.print(myWardrobe);
	}
	
	
	/////////////////////////////////////////////////////
	/////////////////// NEW METHODS /////////////////////
	/////////////////////////////////////////////////////
	
	public static boolean addShirt(Scanner console) throws InputMismatchException, IllegalArgumentException {
		
		String color = "none";
		double price = 0;
		int condInt;
		Condition condition;
		int sizeInt;
		Size size;
		String shirtText;
		
		Shirt shirt = new Shirt(color, price, Condition.NEW, Size.S);
		
		try {
			// COLOR
			System.out.println("What color is the shirt?");
			color = console.next();
			shirt.setColor(color);
			
			// PRICE
			System.out.println("How much did the shirt cost (in USD)?");
			price = console.nextDouble();
			shirt.setPrice(price);
			
			// CONDITION
			System.out.println("Enter the condition: "
					+ "\n3=NEW"
					+ "\n2=GOOD"
					+ "\n1=POOR"
					+ "\n0=TRASHED\n");
			condInt = console.nextInt();
			condition = Condition.intToCondition(condInt);
			shirt.setCondition(condition);
			
			// SIZE
			System.out.println("Enter the size: "
					+ "\n3=XL"
					+ "\n2=L"
					+ "\n1=M"
					+ "\n0=S\n");
			sizeInt = console.nextInt();
			size = Size.intToSize(sizeInt);
			shirt.setSize(size);
			
			// SHIRT TEXT
			System.out.println("What does the text on the shirt say?");
			shirtText = console.next();
			shirt.setShirtText(shirtText);
			
		} catch (InputMismatchException e) {
			System.out.println("Exception thrown : IME : " + e);
			return false;
		} catch (IllegalArgumentException e) {
			System.out.println("Exception thrown : IAE : " + e);
			return false;
		}
		return true;
	}
	
	public static boolean addPants(Scanner console) throws InputMismatchException, IllegalArgumentException {
		
		String color = "none";
		double price = 0;
		int condInt;
		Condition condition;
		int waist = 1;
		int inseam = 1;
		
		Pants pants = new Pants(color, price, Condition.NEW, waist, inseam);
		
		try {
			// COLOR
			System.out.println("What color are the pants?");
			color = console.next();
			pants.setColor(color);
			
			// PRICE
			System.out.println("How much did the pants cost (in USD)?");
			price = console.nextDouble();
			pants.setPrice(price);
			
			// CONDITION
			System.out.println("Enter the condition: "
					+ "\n3=NEW"
					+ "\n2=GOOD"
					+ "\n1=POOR"
					+ "\n0=TRASHED\n");
			condInt = console.nextInt();
			condition = Condition.intToCondition(condInt);
			pants.setCondition(condition);
			
			// WAIST
			System.out.println("What is the waist size (in inches)?");
			waist = console.nextInt();
			pants.setWaist(waist);			
			
			// INSEAM
			System.out.println("What is the inseam length (in inches)?");
			inseam = console.nextInt();
			pants.setInseam(inseam);
			
		} catch (InputMismatchException e) {
			System.out.println("Exception thrown : IME " + e);
			return false;
		} catch (IllegalArgumentException e) {
			System.out.println("Exception thrown : IAE : " + e);
			return false;
		}
		return true;
	}
	
	
	
}
	
	
	
	
	
	
	
	
	
 	  
