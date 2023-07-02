/**
 * File name: Driver.java
 * Author: Ting Wang 41077727
 * Course: CST8284-301
 * Assignment: 1
 * Date: 5/19/2023
 * Professor: HESHAM SAADAWI
 * Purpose:This class is to ask user to input information and output a format result.
 */
import java.util.Scanner;//import class Scanner
/**
 * @author Ting Wang
 * @version 2
 * @see Driver
 * @since jdk 17
 */
public class Driver {
/**
 * main method that instantiates a new Username object, prompts the user to 
 * input the first name, last name, and student number, and loads these
 * values using the Username object’s setters.
 * @param args command-line arguments
 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String textInput;
		long numberInput;
		String report;
		Username user= new Username();
		
		System.out.print("Enter First Name:");
		textInput=keyboard.nextLine();
		user.setFirstName(textInput);
		
		System.out.print("Enter Last Name:");
		textInput=keyboard.nextLine();
		user.setLastName(textInput);
		
		System.out.print("Enter Student Number:");
		numberInput=keyboard.nextLong();
		keyboard.nextLine();
		user.setStudentNumber(numberInput);
		
		keyboard.close();
		
        report=user.toString();
		System.out.println(report);
		System.out.printf("Program by Ting Wang");
		}
}