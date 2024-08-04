import javax.swing.JOptionPane;

/**
 * The BloodData class simulates blood characteristics like blood type and RH factor
 */
public class BloodData {
	
	private String bloodType;
	private String rhFactor;
	
	/**
	 * The constructor initializes the blood type and RH factor using custom values
	 * 
	 * @param blood_type The custom value used to set the blood_type
	 * @param rh_factor The custom value used to set the rh_factor
	 */
	public BloodData(String bloodType, String rhFactor) {
		this.bloodType = bloodType;
		this.rhFactor = rhFactor;
	}
	
	/**
	 * The constructor initializes the blood type and RH factor with default values "O" and "+"
	 */
	public BloodData() {
		this("O", "+");
	}
	
	// Getters and Setters for the fields blood_type and rh_factor
	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getRhFactor() {
		return rhFactor;
	}

	public void setRhFactor(String rhFactor) {
		this.rhFactor = rhFactor;
	}
	
	/**
	 * The displayDetails method displays a JOptionPane message containing the blood_type and rh_factor of the object
	 * 
	 * @param blood_data_name The name of the object
	 */
	public void displayDetails(String bloodDataName) {
		JOptionPane.showMessageDialog(null, "Blood type: " + bloodType
		  + "\nRH factor: " + rhFactor, bloodDataName, 1);
	}
	
}
