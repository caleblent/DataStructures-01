package project01package;

public class WardrobeDriver {

	public static void main(String[] args) {

		Apparel socks = new Apparel("white", 2, Condition.POOR);
		Apparel blackVans = new Apparel("black", 70, Condition.POOR);
		Pants jeans = new Pants("dark blue", 32, Condition.GOOD, 32, 32);
		Shirt whiteTank = new Shirt("white", 3, Condition.NEW, Size.M);
		Shirt blueShirt = new Shirt("blue", 18, Condition.GOOD, Size.M);
		Shirt grayVest = new Shirt("gray", 45, Condition.NEW, Size.M);

		Shirt redShirt = new Shirt("red", 25, Condition.POOR, Size.XL, "My dog ate my homework!");
		Pants snazzyPants = new Pants("glittery green", 3500, Condition.NEW, 36, 32);

		System.out.println("#------------------------------------------#");
		System.out.println("| Caleb's swing dancing attire :           |");
		System.out.println("#------------------------------------------#");
		socks.print();
		blackVans.print();
		jeans.print();
		whiteTank.print();
		blueShirt.print();
		grayVest.print();

		System.out.println("#------------------------------------------#");
		System.out.println("| Proof that the shirt text thing works :  |");
		System.out.println("#------------------------------------------#");
		redShirt.print();
		snazzyPants.print();
		
		System.out.println("#------------------------------------------#");
		System.out.println("| Put more legibly (in plain English) :    |");
		System.out.println("#------------------------------------------#");
		System.out.println(inPlainEnglish(socks));
		System.out.println(inPlainEnglish(blackVans));
		System.out.println(inPlainEnglish(jeans));
		System.out.println(inPlainEnglish(blueShirt));
		System.out.println(inPlainEnglish(whiteTank));
		System.out.println(inPlainEnglish(grayVest));
		System.out.println(inPlainEnglish(redShirt));
		System.out.println(inPlainEnglish(snazzyPants));
		

	}
	
	public static String inPlainEnglish(Shirt shirt) {
		String str = "";
		
		str += "This size " + shirt.getSize() 
			+ " " + shirt.getColor() 
			+ " shirt cost $" + shirt.getPrice()
			+ " and is in " + shirt.getCondition()
			+ " condition.";
		
		if (!shirt.getShirtText().equals("")) {
			str += " It contains the text \"" + shirt.getShirtText() + "\".";
		}
		
		return str;
	}
	
	public static String inPlainEnglish(Apparel apparel) {
		String str = "";
		
		str += "This " + apparel.getColor() 
			+ " apparel cost $" + apparel.getPrice()
			+ " and is in " + apparel.getCondition()
			+ " condition.";
		
		return str;
	}
	
	public static String inPlainEnglish(Pants pants) {
		String str = "";
		
		str += "These " + pants.getColor() 
			+ " pair of pants has a waistline of " + pants.getWaist()
			+ "\" and an inseam of " + pants.getInseam()
			+ "\". It cost $" + pants.getPrice()
			+ " and is in " + pants.getCondition()
			+ " condition.";
		
		return str;
	}

}
