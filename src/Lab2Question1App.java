import javax.swing.JOptionPane;

public class Lab2Question1App {

	public static void main(String[] args) {
		
		// Creates a BloodType object using user input and displays the details
		BloodData bloodData1 = createBloodDataObject();
		bloodData1.displayDetails("bloodData1");
		
		// Creates a BloodType object using the default constructor and displays the details
		BloodData bloodData2 = new BloodData();
		bloodData2.displayDetails("bloodData2");

		// Changes default values of blood_data2 to user values and displays the details
		String userBloodType = JOptionPane.showInputDialog(null, "Enter a bloodtype to change the default");
		bloodData2.setBloodType(userBloodType);
		
		String userRhFactor = JOptionPane.showInputDialog(null, "Enter an rh factor to change the default");
		bloodData2.setRhFactor(userRhFactor);
		
		bloodData2.displayDetails("bloodData2");
	}
	
	/**
	 * The createBloodDataObject method initiates a BloodData object by getting user values for blood_type and rh_factor
	 * 
	 * @return Returns a fully qualified BloodData object
	 */
	public static BloodData createBloodDataObject() {
		String userBloodType = JOptionPane.showInputDialog(null, "Enter the bloodtype");
		String userRhFactor = JOptionPane.showInputDialog(null, "Enter the rh factor");
		
		return new BloodData(userBloodType, userRhFactor);
	}
	
}
