package NoorShamara;

public class NoorsDemo {

	public static void main(String[] args) {
	
		testing("Meridian adding a method to Noors demo class");
		testing2("Added testing2 method... Hi Noor!! :-)");
		
		setName();// Juan (TeamMember) added the setName method into the main method to be tested in Noor's (TeamMember) NoorsDemo class. These changes will be stashed and unstashed for future reference.
		// Juan why did you add setName?
		
		
	}
	public static void setName(){
		System.out.println("Noor");
		
	}
	public static void setAge() {
		System.out.println("10");
	}
	
	public static void testing(String a) {
		System.out.println(a);
	}
	
	public static void testing2(String b) {
		System.out.println(b);
	}
}
