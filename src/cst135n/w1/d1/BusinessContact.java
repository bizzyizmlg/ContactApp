package cst135n.w1.d1;

import java.io.Serializable;

public class BusinessContact extends BaseContact implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String businessHours;
	private String businessWeb;

	public BusinessContact(String name, String description, int phone, String businessHours, String businessWeb) {
		super(name, description, phone);
		this.businessHours = businessHours;
		this.businessWeb = businessWeb;
	}
	





	public BusinessContact(String name, String description, int phone, String businessHours2, String businessWeb2,
			String option, Photo p, Location l) {
		super(name, description, phone);
		this.setPhoto(p);
		this.setLocation(l);
		
		// TODO Auto-generated constructor stub
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
