/*
 * Author: Stanley Pieda
 * Date: March 3, 2022
 * Copyright(C): Algonquin College
 */

/*
 * Represents a person with first name, last name, and phone number.
 */
public class Person {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	
	/*
	 * no-argument constructor sets fields to "unknown"
	 */
	public Person() {
		this("unknown","unknown","unknown");
	}
	
	/*
	 * overloaded constructor accepting values for fields
	 */
	public Person(String firstName, String lastName, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	/*
	 * accessor for firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/*
	 * mutator for firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/*
	 * accessor for lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/*
	 * mutator for lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/*
	 * accessor for phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/*
	 * mutator for phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/*
	 * toString() provides a representation of this class in format of
	 * "First name: %s, Last name: %s, phone number: %s" with associated 
	 * field values.
	 */
	public String toString() {
		String report;
		report = String.format(
				"First name: %s, Last name: %s, phone number: %s", 
				firstName, lastName, phoneNumber);
		return report;
	}
}