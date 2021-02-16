package cst135n.w1.d1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataAccessService extends AddressBook {
	
	List<BusinessContact> businessList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void businessAccess() {
		
		businessList.add(new BusinessContact("Kevin Shannon", "Landscaping", 44022254, "8:00 a.m. until 5:00 p.m.", "www.ShannonLandscaping&Snowplowing.com"));
		businessList.add(new BusinessContact("Bruce Brown", "Twitch Streamer", 44098989, "8:00 a.m. until 10:00 p.m.", "www.twitch.tv/iambizzyi.com"));
		businessList.add(new BusinessContact("KayKay", "Massage", 9872387, "8:00 a.m. until 5:00 p.m.", "www.heyhowyadoin.com"));
	}
	List<PersonContact> personList = new ArrayList<>();

	
	public void personAccess() {
		
		personList.add(new PersonContact("Kevin Shannon", "Landscaping", 44022254));
		personList.add(new PersonContact("Bruce Brown", "Twitch Streamer", 44098989));
		personList.add(new PersonContact("KayKay", "Massage", 9872387));
	

}


	public List<BusinessContact> getBusinessList() {
		return businessList;
	}


	public void setBusinessList(List<BusinessContact> businessList) {
		this.businessList = businessList;
	}


	public List<PersonContact> getPersonList() {
		return personList; 
	}


	public void setPersonList(List<PersonContact> personList) {
		this.personList = personList;
	}


	@Override
	public String toString() {
		return "DataAccessService || Business List =" + businessList + "\n" + personList + "\n"
				+ ", getBusinessList()=" + getBusinessList() +"\n" + "Person List: " + getPersonList() + "]";
	}
	
	
}
