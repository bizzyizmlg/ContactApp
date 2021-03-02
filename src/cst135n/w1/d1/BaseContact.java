package cst135n.w1.d1;

import java.io.Serializable;

// Parent Class
public class BaseContact implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -3574031996117201225L;
	private String name;
	private String description;
	private int phone;
	public Location getLocation() {
		return location;
	}



	public void setLocation(Location location) {
		this.location = location;
	}



	public Photo getPhoto() {
		return photo;
	}



	public void setPhoto(Photo photo) {
		this.photo = photo;
	}



	private Location location;
	private Photo photo;
	
	
	public BaseContact(String name, String description, int phone) {
		super();
		this.name = name;
		this.description = description;
		this.phone = phone;
	}
	public BaseContact(String name, String description, int phone, Photo number1) {
		super();
		this.name = name;
		this.description = description;
		this.phone = phone;
		this.photo = number1;
	}

	 
	 public BaseContact(String state, String city) {
		// TODO Auto-generated constructor stub
	}



	public BaseContact(String name2, String dateOfBirth2, String description2, String option, Photo p, Location l) {
		// TODO Auto-generated constructor stub
	}



	public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPhone() {
			return phone;
		}

		public void setPhone(int phone) {
			this.phone = phone;
		}



		@Override
		public String toString() {
			return "BaseContact [name=" + name + ", description=" + description + ", phone=" + phone + ", location="
					+ location + ", photo=" + photo + "]";
		}



	
	

	


	

	
	

	
}
