package cst135n.w1.d1;

import java.io.Serializable;

public class Location extends BaseContact implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int locationId;
	private String name;
	private int number;
	private String city;
	private String state;
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", name=" + name + ", number=" + number + ", city=" + city
				+ ", state=" + state + "]";
	}
	public Location(int locationId, String name, int number, String city, String state) {
		super(state, city, number);
		this.locationId = locationId;
		this.name = name;
		this.number = number;
		this.city = city;
		this.state = state;
	}
	public Location(String state, String city) {
		super(state, city);
		this.state = state;
		this.city = city;
	}

}
