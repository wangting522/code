import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double userInput;
		double area;
		Cylinder cylinder=new Cylinder();
		
		System.out.print("Enter Height:");
		userInput=keyboard.nextDouble();
		keyboard.nextLine();
		cylinder.setHeight(userInput);
		
		System.out.print("Enter Radius:");
		userInput=keyboard.nextDouble();
		keyboard.nextLine();
		cylinder.setRadius(userInput);
		
		keyboard.close();
		area=cylinder.calculateArea();
		System.out.printf("Area is %.2f%n",area);
	
		System.out.printf("To String %s", cylinder.toString());
		}
}
