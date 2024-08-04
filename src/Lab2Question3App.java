import javax.swing.JOptionPane;

public class Lab2Question3App {

	public static void main(String[] args) {
		
		// Gets information from user for Sandwich object data
		JOptionPane.showMessageDialog(null, "Lets create a Sandwich object");
		
		String sandwichMainIngredient = JOptionPane.showInputDialog(null, "Enter the main ingredient");
		String sandwichBreadType = JOptionPane.showInputDialog(null, "Enter the bread type");
		double sandwichPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the price of the sandwich"));
		
		// Creates the sandwich object using the user input data
		Sandwich userSandwich = createSandwichObject(sandwichMainIngredient, sandwichBreadType, sandwichPrice);
		
		// Displays the user_sandwich object data values
		JOptionPane.showMessageDialog(null, "Main Ingredient: " + userSandwich.getMainIngredient()
									  + "\nBread Type: " + userSandwich.getBreadType()
									  + "\nPrice: $" + userSandwich.getPrice(), "Sandwich Details", 1);
	}
	
	/**
	 * The createSandwichObject method initiates a Sandwich object with custom values for the object fields
	 * 
	 * @param mainIngredient The custom value for the Sandwich objects main_ingredient field 
	 * @param breadType The custom value for the Sandwich objects bread_type field
	 * @param price The custom value for the Sandwich objects price field
	 * @return Returns a fully qualified Sandwich object
	 */
	public static Sandwich createSandwichObject(String main_ingredient, String bread_type, double price) {
		Sandwich sandwichObject = new Sandwich();
		
		sandwichObject.setMainIngredient(main_ingredient);
		sandwichObject.setBreadType(bread_type);
		sandwichObject.setPrice(price);
		
		return sandwichObject;
	}

}
