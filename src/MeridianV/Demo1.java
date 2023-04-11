package MeridianV;

public class Demo1 {

	public static void main(String[] args) {
		
		test();
		SetStudentName();		
		concepcionJuan.JuanConcepcion obj = new concepcionJuan.JuanConcepcion(); //first change to Meridian's code by Juan//I created a reference object to concepcionJuan package and the JuanConcepcion class
		
		obj.juan(null); // second change to Meridian's code by Juan// I called the object.juan method which it should print "Juan" which is Juan's name.
		
	}

	public static void test () {
		
		System.out.println("First push test for B9-T3-Part2....");
	}
	
	public static void SetStudentName () {
		System.out.println("Meridian Valverde");
	
	}
	
	public static void setWeather( ) {
		System.out.println("Suny");
	}

}
