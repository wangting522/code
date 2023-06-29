
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		CoffeeBean coffee = new CoffeeBean();
		double weight;
		double caffeine;
		String report;
		String continueOption;
		
		do{
			System.out.printf("enter weight of bean (milligrams): ");
			weight = keyboard.nextDouble();
			keyboard.nextLine();
			coffee.setWeight(weight);
			
			System.out.printf("enter caffeine per milligram of coffee (milligrams): ");
			caffeine = keyboard.nextDouble();
			keyboard.nextLine();
			coffee.setCaffeine(caffeine);
			
			report=coffee.checkTotalCaffeine();
			System.out.printf("checkTotalCaffeine reports: %s%n", report);
			
			System.out.printf("Enter values again? (Y/N): ");			
			continueOption = keyboard.nextLine();
		} 
		while (continueOption.equalsIgnoreCase("Y"));
		System.out.println("Program by Ting Wang");
	}
	
}

