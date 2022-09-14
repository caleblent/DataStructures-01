package project01package;

public abstract class Apparel implements Comparable<Apparel>{

	/**
	 * All pieces of apparel should have a color, price, and condition
	 */
	private String color;
	private double price;
	private Condition condition;
	private Condition[] conditions = {
			Condition.NEW,
			Condition.GOOD,
			Condition.POOR,
			Condition.TRASHED
	};

	/**
	 * Constructor function for apparel
	 * 
	 * @param color
	 * @param price
	 * @param condition
	 */
	public Apparel(String color, double price, Condition condition) throws IllegalArgumentException {
		this.setColor(color);
		this.setPrice(price);
		this.setCondition(condition);
	}

	/**
	 * Fetches the apparel's color
	 * 
	 * @return color
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * Fetches the apparel's price
	 * 
	 * @return price
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * Fetches the apparel's condition
	 * 
	 * @return condition (String)
	 */
	public String getCondition() {
		return this.condition.toString();
	}
	
	/**
	 * Fetches the apparel's condition
	 * 
	 * @return condition (int)
	 */
	public int getConditionDecimal() {
		return this.condition.toDecimal();
	}

	/**
	 * Sets the apparel's color to the String value passed into it
	 * 
	 * @param color
	 */
	public void setColor(String color) throws IllegalArgumentException {
		if (color.isBlank())
			throw new IllegalArgumentException("Color cannot be null or empty");
		else
			this.color = color;
	}

	/**
	 * Sets the apparel's price to the int value passed into it
	 * 
	 * @param price
	 */
	public void setPrice(double price) throws IllegalArgumentException {
		if (price < 0)
			throw new IllegalArgumentException("Price cannot be negative");
		else
			this.price = price;
	}

	/**
	 * Sets the apparel's condition to the Condition value passed into it
	 * 
	 * @param condition
	 */
	public void setCondition(Condition condition) throws IllegalArgumentException {
		for (int i = 0; i < this.conditions.length; i++) {
			if (conditions[i].equals(condition))
				this.condition = condition;
		}
	}
	
	/**
	 * Converts the apparel object into an English readable sentence.
	 * 
	 * @return String
	 */
	public String toString() {
		String str = "";
		
		str += "This " + this.getColor() 
			+ " apparel cost $" + this.getPrice()
			+ " and is in " + this.getCondition()
			+ " condition.";
		
		return str;
	}

	/**
	 * Converts the apparel object into what would be its
	 * JavaScript Object Notation (JSON) equivalent.
	 * 
	 * @return String
	 */
	public String toStringJSON() {
		String ret = "";
		ret += "Apparel : { \n    ";
		ret += "Color : " + this.color + "\n    ";
		ret += "Price : $" + this.price + "\n    ";
		ret += "Condition : " + this.condition.toString();
		ret += "\n}";
		return ret;
	}

	/**
	 * Prints the result from toString()
	 */
	public void print() {
		System.out.println(this.toString());
	}
	
	/**
	 * Prints the result from toStringJSON()
	 */
	public void printJSON() {
		System.out.println(this.toStringJSON());
	}
	
	/**
	 * 
	 */
	@Override
	public int compareTo(Apparel other){
		if (this.getCondition().equals(other.getCondition())) {
			// TODO evaluate based on price; low prices before high prices
			return (int) (this.getPrice() - other.getPrice());
		} else {
			// TODO evaluate based on condition
			return this.getConditionDecimal() - other.getConditionDecimal();
		}
	}
}