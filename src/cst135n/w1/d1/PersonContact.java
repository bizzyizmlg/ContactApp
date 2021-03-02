package cst135n.w1.d1;

import java.io.Serializable;

public class PersonContact extends BaseContact implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1213150330509575196L;
	
	
	// Attribute

	

	public PersonContact(String name, String description, int phone) {
		super(name, description, phone);
		
	

	}








	







	public PersonContact(String name, String description, int phone, String option, Photo p, Location l) {
		super(name, description, phone);
		
	}
















	@Override
	public String toString() {
		return "Location: " + getLocation() + ", Photo: " + getPhoto() + ", Description: "
				+ getDescription() + ", Name: " + getName() + ", Phone: " + getPhone();
	}


















}
