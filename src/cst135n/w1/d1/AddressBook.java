package cst135n.w1.d1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

	List<BaseContact> baseContacts = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void open() {

	
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome");

//		PersonContact personContact = new PersonContact(440-222-9595, "My name is Bruce and I like to chill");
//		PersonContact personContact1 = new PersonContact(85, "www.google.com", "1");
//		

//		baseContacts.add(new PersonContact("Bruce" , "Honestly just chillin", 4402222));
//		baseContacts.add(new BusinessContact("Bruce", "Just chillin", 4440000, "8:00 a.m. - 5:00 p.m.", "www.google.com"));

	
		menu();
	}

	private void menu() {
		
//		PersonContact pc = new PersonContact("Kevin Shannon", "Landscaping", 44022254);
//		pc.getDateOfBirth();
		System.out.println("Main Menu");
		System.out.println("==========");
		System.out.println("1) Add a Person Contact");
		System.out.println("2) Create a Business Contact");
		System.out.println("3) Show All Contacts");
		System.out.println("4) Show Details of One Contact");
		System.out.println("5) Update a Contact");
		System.out.println("6) Delete a Contact");
		System.out.println("7) Search for a Contact by Name");
		System.out.println("8) Sort All Contacts by Name");
		System.out.println("0) Exit");
		System.out.println("========");
		System.out.println("Which option do you want? ");
		int option = sc.nextInt();
		sc.nextLine();
		branch(option);
		menu();
	}

	private void branch(int option) {
		
		
		DataAccessService das = new DataAccessService();
		das.businessAccess();
		das.personAccess();
		PersonContact pc = new PersonContact("Kevin Shannon", "Landscaping", 44022254);
		pc.getDateOfBirth();
		BusinessContact businessContact = new BusinessContact("Kevin Shannon", "Landscaping", 44022254, "8:00 a.m. until 5:00 p.m.", "www.ShannonLandscaping&Snowplowing.com");
		businessContact.toString();
		
		switch (option) {
		case 1:
			System.out.println("Contact");
			System.out.println(pc.toString());
			
			
			
			break;
		case 2:
			System.out.println("Business Contact");
			System.out.println(businessContact.toString());
			break;
		case 3:
			System.out.println("Show all Contacts");
			showAll();
			System.out.print(das.toString());
		case 4:
			System.out.println("Show Details of One Contact");
			break;
		case 5:
			System.out.println("Update a Contact");
			break;
		case 6:
			System.out.println("Delete a Contact");
			break;
		case 7:
			System.out.println("Search for a Contact by Name");
			break;
		case 8:
			System.out.println("Sorc All Contacts by Name");
			break;
		case 0:
			System.out.println("Exit");
			default:
				return;
			
		}
	}
	
	private void showAll() {
		System.out.println("All Contacts");
		System.out.println("==========");
		for(int i = 0; i < baseContacts.size(); i++) {
			System.out.println(i + ") " + baseContacts.get(i));
		}
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
