package project01package;

public class WardrobeDriver {

	public static void main(String[] args) {

		Shirt whiteTank = new Shirt("white", 3, Condition.NEW, Size.M);
		Shirt blueShirt = new Shirt("blue", 18, Condition.GOOD, Size.M);
		Shirt greenTank = new Shirt("green", 6, Condition.POOR, Size.M);
		Shirt redVNeck = new Shirt("red", 5, Condition.TRASHED, Size.S);
		
		Shirt grayVNeck = new Shirt("gray", 4, Condition.NEW, Size.L);
		Shirt blackShirt = new Shirt("black", 8, Condition.GOOD, Size.M);
		Shirt hawaiian = new Shirt("colorful", 2, Condition.POOR, Size.M);
		Shirt brownTank = new Shirt("brown", 11, Condition.NEW, Size.S);
		
//		System.out.println("whiteTank condition: " + whiteTank.getCondition() + " : " + whiteTank.getConditionDecimal());
//		System.out.println("blueShirt condition: " + blueShirt.getCondition() + " : " + blueShirt.getConditionDecimal());
//		System.out.println("greenTank condition: " + greenTank.getCondition() + " : " + greenTank.getConditionDecimal());
//		System.out.println("redVNeck condition: " + redVNeck.getCondition() + " : " + redVNeck.getConditionDecimal());
		
		System.out.println(whiteTank.compareTo(grayVNeck));
		System.out.println(whiteTank.compareTo(blackShirt));
		System.out.println(whiteTank.compareTo(hawaiian));
		System.out.println(whiteTank.compareTo(brownTank));

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
	
}
