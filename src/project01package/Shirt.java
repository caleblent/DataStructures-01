package project01package;

public class Shirt extends Apparel {

	private Size size;
	private String shirtText;

	public Shirt(String color, int price, Condition condition, Size size) {
		super(color, price, condition);
		this.size = size;
		this.shirtText = "";
	}

	public Shirt(String color, int price, Condition condition, Size size, String shirtText) {
		super(color, price, condition);
		this.size = size;
		this.shirtText = shirtText;
	}
	
	public String getSize() {
		return this.size.toString();
	}

	public String getShirtText() {
		return this.shirtText;
	}
	
	public void setSize(Size size) {
		this.size = size;
	}
	
//	HOW? TODO
//	public void setSize(String size) {
//		this.size = size;
//	}

	public void setShirtText(String shirtText) {
		this.shirtText = shirtText;
	}

	public String toString() {
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
