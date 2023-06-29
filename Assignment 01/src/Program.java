import java.util.Scanner;//import class Scanner

public class Program {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);//make a Scanner
		double userInput;
		double volume;
		Cone cone=new Cone();
		
		System.out.print("Enter Height:");
		userInput=keyboard.nextDouble();//use a Scanner method for input
		keyboard.nextLine();//remove line terminator character
		cone.setHeight(userInput);
		
		System.out.print("Enter Radius:");
		userInput=keyboard.nextDouble();
		keyboard.nextLine();
		cone.setRadius(userInput);
		
		keyboard.close();
		
		volume=cone.calculateVolume();
		System.out.printf("Volume is %.2f%n",volume);//formatting output
		System.out.printf("Program by Ting Wang");
		}
}
