package cst135n.w1.d1;

public class PersonContact extends BaseContact {

	// Attribute
	private String dateOfBirth;
	

	public PersonContact(String name, String description, int phone) {
		super(name, description, phone);
	

	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "PersonContact || Date Of Birth: " + dateOfBirth +"\n" + "Description: " + getDescription() +"\n" + "Name: "
				+ getName() + "\n" + "Phone: " + getPhone() + "\n" + "]";
	}

	



}
