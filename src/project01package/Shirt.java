package project01package;

public class Shirt extends Apparel {

	/**
	 * All shirts should have a size, in addition to the attributes
	 * all apparel have (color, price, condition). Some may have text
	 * on the shirt as well.
	 */
	private Size size;
	private String shirtText;

	/**
	 * Constructor function for shirt WITHOUT shirt text
	 * 
	 * @param color
	 * @param price
	 * @param condition
	 * @param size
	 */
	public Shirt(String color, double price, Condition condition, Size size) {
		super(color, price, condition);
		this.size = size;
		this.shirtText = "";
	}

	/**
	 * Constructor function for shirt WITH shirt text
	 * 
	 * @param color
	 * @param price
	 * @param condition
	 * @param size
	 * @param shirtText
	 */
	public Shirt(String color, double price, Condition condition, Size size, String shirtText) {
		super(color, price, condition);
		this.size = size;
		this.shirtText = shirtText;
	}
	
	/**
	 * Fetches the shirt's size
	 * 
	 * @return size
	 */
	public String getSize() {
		return this.size.toString();
	}

	/**
	 * Fetches the shirt's text
	 * 
	 * @return shirtText
	 */
	public String getShirtText() {
		return this.shirtText;
	}
	
	/**
	 * Sets the shirt's size to the Size value passed to it
	 * 
	 * @param size
	 */
	public void setSize(Size size) {
		this.size = size;
	}

	/**
	 * Sets the shirt's text to the String value passed to it
	 * 
	 * @param shirtText
	 */
	public void setShirtText(String shirtText) {
		this.shirtText = shirtText;
	}
	
	/**
	 * Converts the shirt object into an English readable sentence.
	 * 
	 * @return String
	 */
	public String toString() {
		String str = "";
		
		str += "This size " + this.getSize() 
			+ " " + this.getColor() 
			+ " shirt cost $" + this.getPrice()
			+ " and is in " + this.getCondition()
			+ " condition.";
		
		if (!this.getShirtText().equals("")) {
			str += " It contains the text \"" + this.getShirtText() + "\".";
		}
		
		return str;
	}

	/**
	 * Converts the shirt object into what would be its
	 * JavaScript Object Notation (JSON) equivalent.
	 * 
	 * @return String
	 */
	public String toStringJSON() {
		String ret = "";
		ret += "Shirt : { \n    ";
		ret += "Color : " + this.getColor() + "\n    ";
		ret += "Price : $" + this.getPrice() + "\n    ";
		ret += "Condition : " + this.getCondition() + "\n    ";
		ret += "Size : " + this.size;
		if (!this.shirtText.equals("")) {
			ret += "\n    Shirt Text : " + this.shirtText;
		}
		ret += "\n}";
		return ret;
	}
}
