package dp.tdtu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ContactList {
	List<Contact> ContactList = new ArrayList<>();

	private String getInstance ;
	/* Contact contact; */
	private int top = 0;

	public static void main(String[] args) throws IOException {
	    ContactList list = new ContactList();

	    BufferedReader keyIn;
	    keyIn = new BufferedReader(new InputStreamReader(System.in));
	    String choose = "";
	    while (true) {

	        System.out.println("\n[1] Add contact");
	        System.out.println("[2] View all contacts");
	        System.out.println("[3] Quit");
	        System.out.print("Choose : ");

	        try {
	            choose = keyIn.readLine();
	        } catch (IOException e) {

	            System.out.println("Error");
	        }
	        switch (choose) {
	            case "1":
	                list.addContact();
	                break;
	            case "2":
	                list.viewContacts();
	                break;
	            case "3":
	                System.exit(0);
	                break;
	            default:
	                System.out.println("Error");
	                break;
	         }

	       }
	    }

	public ContactList() {
	    this.ContactList = new ArrayList<>();
	}


	public void addContact() throws IOException {
	    BufferedReader keyIn;
	    keyIn = new BufferedReader(new InputStreamReader(System.in));
	    String firstName;
	    String lastName;
	    String address;
	    String email;
	    String phone;
	    String quanhe;
	    
	    @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	    System.out.println("Please enter Specify the contact type (1) BanBe or (2) khachHang or (3) HoHang: ");
	    int contactType = input.nextInt();
	    if (contactType == 1) {
	        System.out.print("First Name: ");
	        firstName = keyIn.readLine();
	        System.out.print("Last Name: ");
	        lastName = keyIn.readLine();
	        System.out.print("Address: ");
	        address = keyIn.readLine();
	        System.out.print("E-mail address: ");
	        email = keyIn.readLine();
	        System.out.print("Phone number: ");
	        phone = keyIn.readLine();
	        System.out.print("Friend Type:");
	        BanBe entry;
	        entry = new BanBe(firstName, lastName, address, email,phone);
	        ContactList.add(entry);
	        top++;
	        try {
	            entry.write();
	        } catch (Exception e) {
	        }

	    } else if (contactType == 2) {
	        System.out.print("First Name: ");
	        firstName = keyIn.readLine();
	        System.out.print("Last Name: ");
	        lastName = keyIn.readLine();
	        System.out.print("Address: ");
	        address = keyIn.readLine();
	        System.out.print("E-mail address: ");
	        email = keyIn.readLine();
	        System.out.print("Phone number: ");
	        phone = keyIn.readLine();
	        System.out.print("Customer Information ");
	        KhachHang entry;
	        entry = new KhachHang(firstName, lastName, address, email, phone);
	        ContactList.add(entry);
	        top++;
	        try {
	            ((KhachHang) entry).write();
	        } catch (Exception e) {
	        }

	    }else if (contactType == 3) {
	        System.out.print("First Name: ");
	        firstName = keyIn.readLine();
	        System.out.print("Last Name: ");
	        lastName = keyIn.readLine();
	        System.out.print("Address: ");
	        address = keyIn.readLine();
	        System.out.print("E-mail address: ");
	        email = keyIn.readLine();
	        System.out.print("Phone number: ");
	        phone = keyIn.readLine();
	        System.out.print("Frendship: ");
	        quanhe = keyIn.readLine();
	     
	        HoHang entry;
	        entry = new HoHang(firstName, lastName, address, email, phone,quanhe);
	        top++;
	        try {
	            entry.write();
	        } catch (Exception e) {
	        }
	    }
	}

	public void view() {
	for (int index = 0; index < top; index++) {
	    ContactList.get(index).viewContacts();
	    }
	}

	private void viewContacts() {
		System.out.println(ContactList);
	}

	public String getGetInstance() {
		return getInstance;
	}

	public void setGetInstance(String getInstance) {
		this.getInstance = getInstance;
	}
}
