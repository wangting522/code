/* 
 * Author: Stanley Pieda
 * Date: March 10, 2022
 * Copyright(C): Algonquin College
 */
import java.util.Scanner;

/*
 * Demonstrates a simple menu system.
 */
public class RunDemo {

	/*
	 * Entry point, and core logic for the application.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Person person = new Person();
		
		String value; // used for String input and output
		int option; // user menu selection
		String continueOption; // use text-based sentinel value

		// avoid magic numbers
		final int DISPLAY_FIRST_NAME = 1;
		final int DISPLAY_LAST_NAME = 2;
		final int DISPLAY_PHONE = 3;
		final int DISPLAY_ALL = 4;

		do {
			System.out.printf("Enter first name: ");
			value = keyboard.nextLine();
			person.setFirstName(value);

			System.out.printf("Enter last name: ");
			value = keyboard.nextLine();
			person.setLastName(value);

			System.out.printf("Enter phone number: ");
			value = keyboard.nextLine();
			person.setPhoneNumber(value);

			System.out.printf("Select from the following menu:%n");
			System.out.printf("%d to show first name%n", DISPLAY_FIRST_NAME);
			System.out.printf("%d to show last name%n", DISPLAY_LAST_NAME);
			System.out.printf("%d to show phone number%n", DISPLAY_PHONE);
			System.out.printf("%d to show all%n", DISPLAY_ALL);
			option = keyboard.nextInt();
			keyboard.nextLine(); // clean up input stream

			switch(option) {
			case DISPLAY_FIRST_NAME:
				value = person.getFirstName();
				break;
			case DISPLAY_LAST_NAME:
				value = person.getLastName();
				break;
			case DISPLAY_PHONE:
				value = person.getPhoneNumber();
				break;
			case DISPLAY_ALL:
				value = person.toString();
				break;
			default:
				value = "Invalid menu option selected";
				break;
			}
			System.out.println(value);
			System.out.println("Continue Program (yes / no)?");
			continueOption = keyboard.nextLine();
		} while (continueOption.equalsIgnoreCase("yes"));
		System.out.println("Program will shut down.");
	}
}
/*
 Numeric exit program
 public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Person person = new Person();
		String value; // used for String input and output
		int option; // user menu selection

		// avoid magic numbers
		final int DISPLAY_FIRST_NAME = 1;
		final int DISPLAY_LAST_NAME = 2;
		final int DISPLAY_PHONE = 3;
		final int DISPLAY_ALL = 4;
		final int EXIT_PROGRAM = 5;

		do {
			System.out.printf("Enter first name: ");
			value = keyboard.nextLine();
			person.setFirstName(value);

			System.out.printf("Enter last name: ");
			value = keyboard.nextLine();
			person.setLastName(value);

			System.out.printf("Enter phone number: ");
			value = keyboard.nextLine();
			person.setPhoneNumber(value);

			System.out.printf("Select from the following menu:%n");
			System.out.printf("%d to show first name%n", DISPLAY_FIRST_NAME);
			System.out.printf("%d to show last name%n", DISPLAY_LAST_NAME);
			System.out.printf("%d to show phone number%n", DISPLAY_PHONE);
			System.out.printf("%d to show all%n", DISPLAY_ALL);
			System.out.printf("%d to exit program%n", EXIT_PROGRAM);
			option = keyboard.nextInt();
			keyboard.nextLine(); // clean up input stream

			switch(option) {
			case DISPLAY_FIRST_NAME:
				value = person.getFirstName();
				break;
			case DISPLAY_LAST_NAME:
				value = person.getLastName();
				break;
			case DISPLAY_PHONE:
				value = person.getPhoneNumber();
				break;
			case DISPLAY_ALL:
				value = person.toString();
				break;
			case EXIT_PROGRAM:
				value = "Program will shut down.";
				break;
			default:
				value = "Invalid menu option selected";
				break;
			}
			System.out.println(value);
		} while (option != EXIT_PROGRAM);
	}
}
 */



/*
 * Alternative Menu Logic Part 1
		if (DISPLAY_FIRST_NAME == option) {
			value = person.getFirstName();
		}
		else if (DISPLAY_LAST_NAME == option) {
			value = person.getLastName();
		}
		else if (DISPLAY_PHONE == option) {
			value = person.getPhoneNumber();
		}
		else if (DISPLAY_ALL == option) {
			value = person.toString();
		}
		else {
			value = "Invalid menu option selected";
		}
 */
