package concepcionJuan;

import java.util.ArrayList; //importing ArrayList class
import java.util.LinkedList; // importing the LinkedList class
import java.util.Vector; // importing the Vector class

public class UserNameStoring {
	public static void main(String[] args) {
		ArrayList<String> userNames = new ArrayList<String>(); // defining the ArrayList

		// Adding new elements to the ArrayList
		userNames.add("Paul McCartney");
		userNames.add("George Harrison");
		userNames.add("John Lennon");
		userNames.add("Ringo Star");

		// testing or printing the arrayList
		System.out.println(userNames);

		// adding a last element to the arrayList
		userNames.add("Yoko Ono");

		// testing again the add method to the arrayList
		System.out.println(userNames);
	}
}
