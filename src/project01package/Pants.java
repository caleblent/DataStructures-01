package project01package;

public class Pants extends Apparel {

	/**
	 * All pants objects should have waist and inseam measurements, in
	 * addition to the attributes all apparel have (color, price, condition).
	 */
	private int waist;
	private int inseam;

	/**
	 * Constructor function for pants
	 * 
	 * @param color
	 * @param price
	 * @param condition
	 * @param waist
	 * @param inseam
	 */
	public Pants(String color, int price, Condition condition, int waist, int inseam) throws IllegalArgumentException {
		
		super(color, price, condition);
		
		if (waist <= 0)
			throw new IllegalArgumentException("Waist size must be positive");
		else
			this.waist = waist;
		
		if (inseam <= 0)
			throw new IllegalArgumentException("Inseam length must be positive");
		else
			this.inseam = inseam;
	}

	/**
	 * Fetches the pant's waist measurement
	 * 
	 * @return waist
	 */
	public int getWaist() {
		return this.waist;
	}

	/**
	 * Fetches the pant's inseam measurement
	 * 
	 * @return inseam
	 */
	public int getInseam() {
		return this.inseam;
	}

	/**
	 * Sets the pant's waist measurement to the int value passed to it
	 * 
	 * @param waist
	 */
	public void setWaist(int waist) throws IllegalArgumentException {
		if (waist <= 0)
			throw new IllegalArgumentException("Waist size must be positive");
		else
			this.waist = waist;
	}

	/**
	 * Sets the pant's inseam measurement to the int value passed to it
	 * 
	 * @param inseam
	 */
	public void setInseam(int inseam) throws IllegalArgumentException {
		if (inseam <= 0)
			throw new IllegalArgumentException("Inseam length must be positive");
		else
			this.inseam = inseam;
	}
	
	/**
	 * Converts the pants object into an English readable sentence.
	 * 
	 * @return String
	 */
	public String toString() {
		String str = "";
		
		str += "This " + this.getColor() 
			+ " pair of pants has a waistline of " + this.getWaist()
			+ "\" and an inseam of " + this.getInseam()
			+ "\". It cost $" + this.getPrice()
			+ " and is in " + this.getCondition()
			+ " condition.";
		
		return str;
	}

	/**
	 * Converts the pants object into what would be its
	 * JavaScript Object Notation (JSON) equivalent.
	 * 
	 * @return String
	 */
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
