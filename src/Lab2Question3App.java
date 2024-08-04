import javax.swing.JOptionPane;

public class Lab2Question3App {

	public static void main(String[] args) {
		
		// Gets information from user for Sandwich object data
		JOptionPane.showMessageDialog(null, "Lets create a Sandwich object");
		
		String sandwich_main_ingredient = JOptionPane.showInputDialog(null, "Enter the main ingredient");
		String sandwich_bread_type = JOptionPane.showInputDialog(null, "Enter the bread type");
		double sandwich_price = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the price of the sandwich"));
		
		// Creates the sandwich object using the user input data
		Sandwich user_sandwich = createSandwichObject(sandwich_main_ingredient, sandwich_bread_type, sandwich_price);
		
		// Displays the user_sandwich object data values
		JOptionPane.showMessageDialog(null, "Main Ingredient: " + user_sandwich.getMain_ingredient()
									  + "\nBread Type: " + user_sandwich.getBread_type()
									  + "\nPrice: $" + user_sandwich.getPrice(), "Sandwich Details", 1);
	}
	
	/**
	 * The createSandwichObject method initiates a Sandwich object with custom values for the object fields
	 * 
	 * @param main_ingredient The custom value for the Sandwich objects main_ingredient field 
	 * @param bread_type The custom value for the Sandwich objects bread_type field
	 * @param price The custom value for the Sandwich objects price field
	 * @return Returns a fully qualified Sandwich object
	 */
	public static Sandwich createSandwichObject(String main_ingredient, String bread_type, double price) {
		Sandwich sandwich_object = new Sandwich();
		
		sandwich_object.setMain_ingredient(main_ingredient);
		sandwich_object.setBread_type(bread_type);
		sandwich_object.setPrice(price);
		
		return sandwich_object;
	}

}
