package concepcionJuan;

import java.util.LinkedList;
public class Demo1 {

	public static void main(String[] args) {
		LinkedList<String> studentList = new LinkedList<String>();
		
		studentList.add("Lulu");
		studentList.add("Ali");
		studentList.add("Wawa");
		
		System.out.println("Initial Linked List: " + studentList);
		
		studentList.add(3, "Viorica");
		System.out.println("After adding at index 3: " + studentList);
	}
}
