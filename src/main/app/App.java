package main.app;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		ContactsManager App = new ContactsManager();
		Scanner scan = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("1. Add contact");
			System.out.println("2. Search contact");
			System.out.println("3. Display all contacts");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter your name: ");
				String name = scan.next();
				System.out.print("Enter your phone number: ");
				String phone = scan.next();
				App.addContact(name, phone);
				break;
			case 2:
				System.out.print("Enter your name: ");
				String searchName = scan.next();
				System.out.println(App.searchContact(searchName));
				break;
			case 3:
				System.out.println("Contacts");
				App.showContacts();
			case 4:
				run = false;
				break;
			default:
				System.out.println("Invalid choice!");
			}
		}
		scan.close();
	}

	//A static method
	
}
