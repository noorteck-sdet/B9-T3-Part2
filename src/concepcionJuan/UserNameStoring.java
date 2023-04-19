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

		//adding last element to the array
		userNames.add(3, "Yoko Ono");
		// testing or printing the arrayList
		System.out.println(userNames);
		
		// testing the remove method 
		userNames.remove(3);
		System.out.println(userNames);
		
		//testing the get method
		System.out.println("Getting the value of the second index space: " + userNames.get(2));

		// using the to String method
		System.out.println("Returning a string reperesentation of the list: " + userNames.toString());
		
		LinkedList<String> userNamesLinked = new LinkedList<String>();
		//adding elements to the linked list
		userNamesLinked.add("Chris Novoselic");
		userNamesLinked.add("Dave Grohl");
		userNamesLinked.add("Kurt Cobain");
		//testing the linked list
		System.out.println("Printing the linkedList : " + userNamesLinked);
		//adding a value at the first position of the linked list
		userNamesLinked.addFirst("Courtney Love");
		//testing the add first method
		System.out.println("Printing the linkedList with the addFirst method : " + userNamesLinked);
		
		//testing the Vector Class
		
		Vector<String> fruits = new Vector<String>();
		fruits.add("apple");
		fruits.add("bananas");
		fruits.add("oranges");
		
		//testing the vector
		System.out.println("Printing the vector class : " + fruits);
		
		// testing the Vector Class Constructor and its capacity
		System.out.println("Printing vector capacity : " + fruits.capacity());
		
		//doubling the capacity of a vector
		Vector<String> v2 = new Vector<String>(12);
		System.out.println("Printing the specified capacity of the vector : " + v2.capacity());
		
		//defining a vector with two parameters
		Vector<String> v3 = new Vector<String>(2, 5);
		System.out.println("Printing the vector with two parameters : " + v3.capacity());
	}
}
