import javax.swing.JOptionPane;

public class Lab2Question1App {

	public static void main(String[] args) {
		
		// Creates a BloodType object using user input and displays the details
		BloodData blood_data1 = createBloodDataObject();
		blood_data1.displayDetails("blood_data1");
		
		// Creates a BloodType object using the default constructor and displays the details
		BloodData blood_data2 = new BloodData();
		blood_data2.displayDetails("blood_data2");

		// Changes default values of blood_data2 to user values and displays the details
		String user_bloodtype = JOptionPane.showInputDialog(null, "Enter a bloodtype to change the default");
		blood_data2.setBlood_type(user_bloodtype);
		
		String user_rh_factor = JOptionPane.showInputDialog(null, "Enter an rh factor to change the default");
		blood_data2.setRh_factor(user_rh_factor);
		
		blood_data2.displayDetails("blood_data2");
	}
	
	/**
	 * The createBloodDataObject method initiates a BloodData object by getting user values for blood_type and rh_factor
	 * 
	 * @return Returns a fully qualified BloodData object
	 */
	public static BloodData createBloodDataObject() {
		String user_bloodtype = JOptionPane.showInputDialog(null, "Enter the bloodtype");
		String user_rh_factor = JOptionPane.showInputDialog(null, "Enter the rh factor");
		
		return new BloodData(user_bloodtype, user_rh_factor);
	}
	
}
