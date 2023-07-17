package staticMethodoveriding;

public class TestDriver {

	public TestDriver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Human aHuman  = new Human();
		Human aBoy = new Boy();
		
		aHuman.walk();
		aBoy.walk();   //Parent method is always called as this is the reference type
	}

}
