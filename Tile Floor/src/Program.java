/*
 * Author/modified by: TING WANG
 * Professor: Wafa Hasanain
 * Date: December 8
 * Description: Lab Exam 02 (22F) Section 312
 */
/*
 * this class use a loop in method main to ask the user if they want to enter 
 * more values and keep the program running via a loop.
 */
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		TileFloor tile = new TileFloor();
		int numberOfTile;
		double pricePerTile;
		String report;
		String continueOption;
		
		do{
			System.out.printf("enter number of tiles: ");
			numberOfTile = keyboard.nextInt();
			keyboard.nextLine();
			tile.setNumberOfTile(numberOfTile);
			
			System.out.printf("enter price per tile (dollars): ");
			pricePerTile = keyboard.nextDouble();
			keyboard.nextLine();
			tile.setPricePerTile(pricePerTile);
			
			report=tile.checkTotalCost();
			System.out.printf("checkTotalCost reports: %s%n", report);
			
			System.out.printf("Enter values again? (Y/N): ");			
			continueOption = keyboard.nextLine();
		} 
		while (continueOption.equalsIgnoreCase("Y"));
		System.out.println("Program by Ting Wang");
	}
	
}

