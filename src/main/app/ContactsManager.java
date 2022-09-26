package main.app;

public class ContactsManager {
	
	Contact[] contactList;
	Contact contact = new Contact();
	int noOfContacts;
	
	public ContactsManager() {
		
		this.contactList = new Contact[100];
		
		this.noOfContacts = 0;
		
	}
	
	public void addContact(String name, String num1) {
		
		contact.name = name;
		contact.number = num1;
		
		contactList[noOfContacts] = contact;
		noOfContacts++;
		
		System.out.println("Successfully added");
		
		
	}
	public void showContacts() {
		
		for(int i = 0; i < noOfContacts; i++) {
			
			System.out.println(contactList[i].name);
			System.out.println(contactList[i].number);
		}
	}
	
	
	public String searchContact(String name) {
		
		for(int i=0;i<noOfContacts;i++) {
			if(contactList[i].name.equalsIgnoreCase(name)) {
				
				System.out.println(contactList[i].name);
				System.out.println(contactList[i].number);
			}
		}
		return "No Contact found by this name";
		
	}

}

