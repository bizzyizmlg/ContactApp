package cst135n.w1.d1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

	List<BaseContact> baseContact = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void open() {

	
	
		System.out.println("Welcome");

		baseContact = DataAccessService.read();
	

	
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
		
		
	
		
		switch (option) {
		case 1:
			addContact();
			
	//		System.out.println(pc.toString());
			
			
			
			break;
		case 2:
			System.out.println("Business Contact");
			addBusiness();
			break;
		case 3:
			System.out.println("Show all Contacts");
			showAll();
//			System.out.print(das.toString());
		case 4:
			System.out.println("Show Details of One Contact");
			showDetails();
		case 5:
			System.out.println("Update a Contact");
			update();
			break;
		case 6:
			System.out.println("Delete a Contact");
			remove();
			break;
		case 7:
			System.out.println("Search for a Contact by Name");
			search();
			break;
		case 8:
			System.out.println("Sort All Contacts by Name");
			sortByName();
			break;
		case 0:
			System.out.println("Exit");
			DataAccessService.write(baseContact);
			System.exit(0);
		}
	}
	
	private void search() {
		System.out.println("Search for a contact by name: ");
		System.out.println("=========");
		System.out.println("Name: ");
		String s = sc.nextLine();
		for(int i = 0; i < baseContact.size(); i++) {
			if (baseContact.get(i).getName().toLowerCase().contains(s.toLowerCase()))
			System.out.println(i + ") " + baseContact.get(i));
		}
	}
	private void sortByName() {
		CompareBaseContactNames dn = new CompareBaseContactNames();
		baseContact.sort(dn);
		showAll();
		
	}

	private void showAll() {
		System.out.println("All Contacts");
		System.out.println("==========");
		for(int i = 0; i < baseContact.size(); i++) {
			System.out.println(i + ") " + baseContact.get(i));
		}
		
	
	
	
	}
	
	private void update() {
		showAll();
		System.out.println("Which one would you like to update? ");
		int item = sc.nextInt();
		if (baseContact.get(item) instanceof PersonContact) {
			System.out.println("Updating person contact: ");
			updatePersonContact(item);
		}
		if (baseContact.get(item) instanceof BusinessContact) {
			System.out.println("Updating business contact: ");
			updateBusinessContact(item);
		}
	}
	
	
	private void updatePersonContact(int item) {
		// TODO Auto-generated method stub
		System.out.println("Update person");
		System.out.println("==========");
		System.out.println("Name: " + baseContact.get(item).getName());
		String name = sc.nextLine();
		baseContact.get(item).setName(name);
		sc.nextLine();
		System.out.println("Description: " + baseContact.get(item).getDescription());
		String description = sc.nextLine();
		baseContact.get(item).setDescription(description);
		sc.nextLine();
		System.out.println("Phone Number: " + baseContact.get(item).getPhone());
		int phone = sc.nextInt();
		baseContact.get(item).setPhone(phone);
		sc.nextLine();
	
	
		
		
		
		
	}

	private void updateBusinessContact(int item) {
		System.out.println("Update a business contact: ");
		System.out.println("=======");
		System.out.println("Enter business website: " + baseContact.get(item));
		String businessWeb = sc.next();
		baseContact.get(item).setName(businessWeb);
		sc.nextLine();
		System.out.println("Enter business hours: " + baseContact.get(item));
		String businessHours = sc.next();
		baseContact.get(item).setDescription(businessHours);
		sc.nextLine();
		
		
	}
	
	public void showDetails() {
		System.out.println("Show details of person: ");
		
	}

	private void addContact() {
		System.out.println("Add a Person");
		System.out.println("=======");
		System.out.println("Name: ");
		String name = sc.nextLine();
		sc.nextLine();
	
		System.out.println("Description: ");
		String description = sc.nextLine();
		System.out.println("Phone Number: ");
		int phone = sc.nextInt();
		sc.nextInt();
		System.out.println("Do you want to add a photo? [Y / N]");
		String option = sc.nextLine();
		Photo p = null;
		if (option.equals("Y")) {
			System.out.println("Number for photo: ");
			int id = sc.nextInt();
			System.out.println("Description of photo: ");
			String description1 = sc.nextLine();
			System.out.println("File name: ");
			String fileName = sc.nextLine();
			System.out.println("Date of photo? ");
			String dateOfPhoto = sc.nextLine();
			
		
			p = new Photo(id, description1, dateOfPhoto, fileName);
		}
		
		System.out.println("Do you want to add a location? [Y / N");
		String option2 = sc.nextLine();
		Location l = null;
				if (option2.equals("Y")) {
					System.out.println("State?");
					String state = sc.nextLine();
					System.out.println("City? ");
					String city = sc.nextLine();
					
					l = new Location(state, city);
				}
				
				baseContact.add(new PersonContact(name, description, phone, option, p, l));
	
	}

	private void remove() {
		showAll();
		System.out.println("Which base contact would you like to remove? ");
		int item = sc.nextInt();
		sc.nextLine();
		baseContact.remove(item);
	}
	
	
	
	
	private void addBusiness() {
		System.out.println("Add a Business: ");
		System.out.println("=======");
		System.out.println("Name: ");
		String name = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Description: ");
		String description = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Business Phone #: ");
		int phone = sc.nextInt();
		sc.nextInt();
		
		System.out.println("Business Hours: ");
		String businessHours = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Business Website: ");
		String businessWeb = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Do you want to add a photo? [Y / N]");
		String option = sc.nextLine();
		Photo p = null;
		
		if (option.equals("Y")) {
			System.out.println("Number for photo: ");
			int id = sc.nextInt();
			System.out.println("Short description of photo: ");
			String description1 = sc.nextLine();
			System.out.println("Date of birth? ");
			String dateOfBirth1 = sc.nextLine();
			System.out.println("File name for photo? ");
			String fileName = sc.nextLine();
		
			p = new Photo(id, description, dateOfBirth1, description1);
		}
		
		System.out.println("Do you want to add a location? [Y / N");
		String option2 = sc.nextLine();
		Location l = null;
				if (option2.equals("Y")) {
					System.out.println("State?");
					String state = sc.nextLine();
					System.out.println("City? ");
					String city = sc.nextLine();
					
					l = new Location(state, city);
				}
				
				baseContact.add(new BusinessContact(name, description, phone, businessHours, businessWeb, option, p, l ));
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
