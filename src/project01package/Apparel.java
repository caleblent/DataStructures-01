package project01package;

public class Apparel {

	private String color;
	private int price;
	private Condition condition;

	public Apparel(String color, int price, Condition condition) {
		this.color = color;
		this.price = price;
		this.condition = condition;
	}

	public String getColor() {
		return this.color;
	}

	public int getPrice() {
		return this.price;
	}

	public String getCondition() {
		return this.condition.toString();
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}
	
	// HOW? TODO
//	public void setCondition(String condition) {
//		this.condition = new Condition(condition);
//	}

	public String toString() {
		String ret = "";
		ret += "Apparel : { \n    ";
		ret += "Color : " + this.color + "\n    ";
		ret += "Price : $" + this.price + "\n    ";
		ret += "Condition : " + this.condition.toString();
		ret += "\n}";
		return ret;
	}

	public void print() {
		System.out.println(this.toString());
	}
}