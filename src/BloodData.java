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
	 * @param bloodType The custom value used to set the bloodType
	 * @param rhFactor The custom value used to set the rhFactor
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
	
	// Getters and Setters for the fields bloodType and rhFactor
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
	 * The displayDetails method displays a JOptionPane message containing the bloodType and rhFactor of the object
	 * 
	 * @param bloodDataName The name of the object
	 */
	public void displayDetails(String bloodDataName) {
		JOptionPane.showMessageDialog(null, "Blood type: " + bloodType
		  + "\nRH factor: " + rhFactor, bloodDataName, 1);
	}
	
}
