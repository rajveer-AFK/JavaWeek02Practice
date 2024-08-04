import javax.swing.JOptionPane;

/**
 * The BloodData class simulates blood characteristics like blood type and RH factor
 */
public class BloodData {
	
	private String blood_type;
	private String rh_factor;
	
	/**
	 * The constructor initializes the blood type and RH factor using custom values
	 * 
	 * @param blood_type The custom value used to set the blood_type
	 * @param rh_factor The custom value used to set the rh_factor
	 */
	public BloodData(String blood_type, String rh_factor) {
		this.blood_type = blood_type;
		this.rh_factor = rh_factor;
	}
	
	/**
	 * The constructor initializes the blood type and RH factor with default values "O" and "+"
	 */
	public BloodData() {
		this("O", "+");
	}
	
	// Getters and Setters for the fields blood_type and rh_factor
	public String getBlood_type() {
		return blood_type;
	}

	public void setBlood_type(String blood_type) {
		this.blood_type = blood_type;
	}

	public String getRh_factor() {
		return rh_factor;
	}

	public void setRh_factor(String rh_factor) {
		this.rh_factor = rh_factor;
	}
	
	/**
	 * The displayDetails method displays a JOptionPane message containing the blood_type and rh_factor of the object
	 * 
	 * @param blood_data_name The name of the object
	 */
	public void displayDetails(String blood_data_name) {
		JOptionPane.showMessageDialog(null, "Blood type: " + blood_type
		  + "\nRH factor: " + rh_factor, blood_data_name, 1);
	}
	
}
