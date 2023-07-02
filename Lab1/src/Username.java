/*
 * File name: Username.java
 * Author: Ting Wang 41077727
 * Course: CST8284-301
 * Assignment: 1
 * Date: 5/19/2023
 * Professor: HESHAM SAADAWI
 * Purpose: Represents a person with first name, last name, and student number.
 */
/**
 * @author Ting Wang
 * @version 2
 * @see Driver
 * @since jdk 17
 */
public class Username {
	/**
	 * Variables are private to protect the state of your objects,
	 * it's safe from unexpected changes and our class can manage its own state.
	 * Encapsulating the firstName variable. 
	 */
	private String firstName;
	/**
	 * Encapsulating the lastName variable. 
	 */
	private String lastName;
	/**
	 * Encapsulating the studentNumber variable.
	 */
	private long studentNumber;	
	/**
	 * no-argument constructor sets first name, last name to "unknown" 
	 * and student number to 0.This ensures the object start with a consistent state.
	 */
	public Username() {
		this("unknown","unknown",0);
	}
	/**
	 * overloaded constructor accepting values for fields
	 * @param firstName user's First Name.
	 * @param lastName user's Last Name.
	 * @param studentNumber user's Student Number.
	 */
	public Username(String firstName, String lastName, long studentNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentNumber = studentNumber;
	}

	/**
	 * accessor for firstName
	 * @return an <code>String </code> specifying First Name.
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * mutator for firstName
	 * @param firstName user's First Name.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * accessor for lastName
	 * @return an <code>String </code> specifying Last Name.
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * mutator for lastName
	 * @param lastName user's Last Name.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * accessor for studentNumber
	 * @return an <code>long </code> specifying Student Number.
	 */
	public long getStudentNumber() {
		return studentNumber;
	}
	/**
	 * mutator for studentNumber
	 * @param studentNumber user's Student Number.
	 */
	public void setStudentNumber(long studentNumber) {
		this.studentNumber = studentNumber;
	}
	/**
	 * toString() provides an output in format of first 3 characters of last name +
	 * first 3 characters of first name + last 4 digits of the student number with
	 * all characters in uppercase
	 * @return an <code>String </code> specifying user information.
	 */
	public String toString() {
		String report;
		lastName=String.format("%3s",lastName).replace(' ','_');
		firstName=String.format("%3s",firstName).replace(' ','_');
		report = String.format("%s%s%d", 
				lastName.substring(0,3).toUpperCase(), 
				firstName.substring(0,3).toUpperCase(), studentNumber%10000);
		return report;
	}
}

