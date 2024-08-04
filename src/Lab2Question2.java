import javax.swing.JOptionPane;

public class Lab2Question2 {

	public static void main(String[] args) {
		
		// Gets a value for inches from the user
		String user_inches_value = JOptionPane.showInputDialog(null, "Enter the inches");
		double inches = Integer.parseInt(user_inches_value);
		
		// Converts and outputs the inches in feet and yards (2 decimal places)
		JOptionPane.showMessageDialog(null, inches + " inches is equivalent to " + convertInchesToFeet(inches)
									  + " feet", "Conversion", 1);
		
		JOptionPane.showMessageDialog(null, inches + " inches is equivalent to " + convertInchesToYards(inches)
		  + " yards", "Conversion", 1);
	}
	
	/**
	 * The convertInchesToFeet method converts inches to feet
	 * 
	 * @param inches The given inches to convert to feet
	 * @return Returns the converted feet
	 */
	public static double convertInchesToFeet(double inches) {
		
		double feet = inches / 12;
		return feet;
	}
	
	/**
	 * The convertInchesToYards method converts inches to yards
	 * 
	 * @param inches The given inches to convert to yards
	 * @return Returns the converted yards
	 */
	public static double convertInchesToYards(double inches) {
		
		double yards = inches / 36;
		return yards;
	}
}
