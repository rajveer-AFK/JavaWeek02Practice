/**
 * The Sandwich class simulates a sandwich with fields for the main ingredient, bread type, and price
 */
public class Sandwich {
	
	private String mainIngredient;
	private String breadType;
	private double price;
	
	// Getters and Setters for the fields mainIngredient, breadType, and price
	public String getMainIngredient() {
		return mainIngredient;
	}
	
	public void setMainIngredient(String mainIngredient) {
		this.mainIngredient = mainIngredient;
	}
	
	public String getBreadType() {
		return breadType;
	}
	
	public void setBreadType(String breadType) {
		this.breadType = breadType;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
}
