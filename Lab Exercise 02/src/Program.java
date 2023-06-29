import java.util.Scanner;//import class Scanner

public class Program {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);//make a Scanner
		String textInput;
		double numberInput;
		Car car= new Car();
		String report;
		
		System.out.print("Please enter vehicle identification number: ");
		textInput=keyboard.nextLine();
		car.setVehicleIdentificationNumber(textInput);
		
		System.out.print("Please enter mileage (km): ");
		numberInput=keyboard.nextDouble();//use a Scanner method for input
		keyboard.nextLine();//remove line terminator character
		car.setMileage(numberInput);
		
		System.out.print("Please enter invoice price: ");
		numberInput=keyboard.nextDouble();
		keyboard.nextLine();
		car.setInvoicePrice(numberInput);
        
		keyboard.close();
		
		report=car.toString();				
		System.out.printf(report);
		System.out.printf("Program by Ting Wang");
	}
}
