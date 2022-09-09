package project01package;

public class Pants extends Apparel {

	private int waist;
	private int inseam;

	public Pants(String color, int price, Condition condition, int waist, int inseam) {
		super(color, price, condition);
		this.waist = waist;
		this.inseam = inseam;
	}

	public int getWaist() {
		return this.waist;
	}

	public int getInseam() {
		return this.inseam;
	}

	public void setWaist(int waist) {
		this.waist = waist;
	}

	public void setInseam(int inseam) {
		this.inseam = inseam;
	}
	
	public String toString() {
		String str = "";
		
		str += "These " + this.getColor() 
			+ " pair of pants has a waistline of " + this.getWaist()
			+ "\" and an inseam of " + this.getInseam()
			+ "\". It cost $" + this.getPrice()
			+ " and is in " + this.getCondition()
			+ " condition.";
		
		return str;
	}

	public String toStringJSON() {
		String ret = "";
		ret += "Pants : { \n    ";
		ret += "Color : " + this.getColor() + "\n    ";
		ret += "Price : $" + this.getPrice() + "\n    ";
		ret += "Condition : " + this.getCondition() + "\n    ";
		ret += "Waist : " + this.waist + "\"\n    ";
		ret += "Inseam : " + this.inseam + "\"\n}";
		return ret;
	}
}
