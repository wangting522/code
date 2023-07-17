package staticMethodoveriding;

public class Human {

	public Human() {
		// TODO Auto-generated constructor stub
	}
	
	public static void walk() {
		System.out.println("a Human is walking");
	}

}
//Static methods in Java belong to the class itself rather than an instance of the class. 
//When you call a static method, it is resolved at compile-time based on the reference type 
//rather than the actual object type.