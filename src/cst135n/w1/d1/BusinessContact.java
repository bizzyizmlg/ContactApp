package cst135n.w1.d1;

public class BusinessContact extends BaseContact {
	
	private String businessHours;
	private String businessWeb;

	public BusinessContact(String name, String description, int phone, String businessHours, String businessWeb) {
		super(name, description, phone);
		this.businessHours = businessHours;
		this.businessWeb = businessWeb;
	}
	


	public String getBusinessHours() {
		return businessHours;
	}

	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}

	public String getBusinessWeb() {
		return businessWeb;
	}

	public void setBusinessWeb(String businessWeb) {
		this.businessWeb = businessWeb;
	}



	@Override
	public String toString() {
		return "Business Contact || Business Hours: " + businessHours + "\n" + ", Business Web: " + businessWeb + "\n" 
				+ ", Description: " + getDescription() + "\n" + ", Name: " + getName() +"\n" + ", Phone #: " + getPhone() + "\n"
				+ "]";
	}



	

	
	
}
