      package cst135n.w1.d1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DataAccessService {
	
	
	
	public static List<BusinessContact> businessAccess() {
		List<BusinessContact> businessList = new ArrayList<>();

		businessList.add(new BusinessContact("Kevin Shannon", "Landscaping", 44022254, "8:00 a.m. until 5:00 p.m.", "www.ShannonLandscaping&Snowplowing.com"));
		businessList.add(new BusinessContact("Bruce Brown", "Twitch Streamer", 44098989, "8:00 a.m. until 10:00 p.m.", "www.twitch.tv/iambizzyi.com"));
		businessList.add(new BusinessContact("KayKay", "Massage", 9872387, "8:00 a.m. until 5:00 p.m.", "www.heyhowyadoin.com"));
		return businessList;
	}
	

	
//	public static List<PersonContact> personAccess() {
//		List<PersonContact> personList = new ArrayList<>();
//		personList.add(new PersonContact("Kevin Shannon", "Landscaping", 44022254));
//		personList.add(new PersonContact("Bruce Brown", "Twitch Streamer", 44098989));
//		personList.add(new PersonContact("KayKay", "Massage", 9872387, new Photo(51, "test", "Septemeber 8th", "file name")));
//	return personList;
//
//}

	public static void write(List<BaseContact> baseContact) {
		
		try {
			FileOutputStream fos = new FileOutputStream("baseContact.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(baseContact);
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			//  Auto-generated catch block
	
		}
	}
	
	@SuppressWarnings("unchecked")
	public static List<BaseContact> read() {
		List<BaseContact> baseContact = new ArrayList<>();
//		baseContact.addAll(DataAccessService.businessAccess());
//		baseContact.addAll(DataAccessService.personAccess());
//		
//		
//
//		baseContact.add(new PersonContact("Bruce" , "Honestly just chillin", 4402222));
//		baseContact.add(new BusinessContact("Bruce", "Just chillin", 4440000, "8:00 a.m. - 5:00 p.m.", "www.google.com"));
		
		try {
			FileInputStream fis = new FileInputStream("baseContact.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			// Casting 
			baseContact = (List<BaseContact>) ois.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return baseContact;
	}
	
	
	
}
