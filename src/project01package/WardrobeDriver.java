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
		
//		public Shirt(String color, int price, Condition condition, Size size, String shirtText)
		myClothes.add(new Shirt("white", 9.99, Condition.POOR, Size.M, ""));
		myClothes.add(new Pants("blue", 29.99, Condition.NEW, 30, 32));
		myClothes.add(new Pants("black", 39.99, Condition.TRASHED, 44, 35));
		myClothes.add(new Pants("khaki", 42.99, Condition.GOOD, 40, 38));
		
		//Your Apparel class should implement Comparable<Apparel> interface, which
		//then makes you compatible with this line.  Uncomment it once you've read
		//this.
		//TODO uncomment the line below
		//Collections.sort(myClothes);
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
	
	
}
	
	
	
	
	
	
	
	
	
 	  
