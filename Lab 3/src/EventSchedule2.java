/*
 * File name:EventSchedule.java
 * Author: Ting Wang 41077727
 * Course: CST8284-301
 * Lab: 3
 * Date: 5/28/2023
 * Professor: HESHAM SAADAWI
 */
/**
 * This program depicts Overloaded constructor calls.
 * It shows the chaining of overloaded constructors using "this" keyword.
 * This lab has been completed for demo by: TING WANG. 
 */
/**
 * This class demonstrates constructor chaining using keyword this,
 * here the more complex constructors all call against the simpler ones,
 * chaining the calls 'downwards' from the constructor with the most
 * parameters to the default no-parameter constructor.
 * This approach works, however the default constructor will assign data that 
 * will likely be replaced as the constructors chain their calls.
 * See class EventSchedule for comparison.
 * 
 * EventSchedule2() assigns default values to the fields.
 * 
 * EventSchedule2(int) calls EventSchedule2() which assigns default values, then program flow
 * returns to EventSchedule2(int) which assigns a value to variety a second time.
 * 
 * EventSchedule2(int,int) calls EventSchedule2(int) which calls EventSchedule2() which 
 * assigns default values, then program flow returns to EventSchedule2(int) which 
 * assigns a value to variety a second time, then program flow returns to 
 * EventSchedule2(int, int) which assigns a value to month a second time.
 * 
 * EventSchedule2(int,int,int) calls EventSchedule2(int,int) which calls
 * EventSchedule2(int,int) which calls EventSchedule2(int) which calls EventSchedule2() and
 * EventSchedule2() assigns the default values to the fields, then program flow returns
 * to EventSchedule2(int) which assigns a value to variety a second time, then program
 * flow returns to EventSchedule2(int, int) which assigns a value to month a second time, 
 * then program flow returns to EventSchedule2(int,int,int) 
 * which assigns a value a second time to day.
 * 
 * @see  EventSchedule
 * @author TING WANG
 */
 import java.time.LocalDate;
 public class EventSchedule2 {

	/**
	 * year component of the date of EventSchedule.
	 */
	private int year;
	
	/**
	 * month component of the date of EventSchedule.
	 */
	private int month;
	
	/**
	 * day component of the date of EventSchedule.
	 */
	private int day;
	
	/**
	 * The default constructor sets year, month, day to the current date.
	 */
	public EventSchedule2() {
		year=LocalDate.now().getYear();
		month=LocalDate.now().getMonthValue();
		day=LocalDate.now().getDayOfMonth();
		System.out.println("EventSchedule() was called");
	}
	
	/**
	 * This constructor sets the year as passed, month to current month,
	 * and day to current day.
	 * @param year The year of this EventSchedule.
	 */

	public EventSchedule2(int year) {
        this();
        this.year=year;
		System.out.println("EventSchedule(int) was called");
	}
	
	/**
	 * 
	 * This constructor sets the year as passed, month as passed,
	 * and day to current day.
	 * @param year The year of this EventSchedule.
	 * @param month of this EventSchedule.
	 */
	
	public EventSchedule2 (int year,int month) {
        this(year);
        this.month=month;
		System.out.println("EventSchedule(int, int) was called");
	} 

	/**
	 * This constructor sets the year as passed, month as passed, and
	 * day as passed.
	 * @param year The year of this EventSchedule.
	 * @param month of this EventSchedule.
	 * @param day of this EventSchedule.
	 */
	
	public EventSchedule2(int year, int month, int day) {
        this(year,month);
		this.day=day;
		System.out.println("EventSchedule(int,int,int) was called");
	}
		
	/**
	 * Returns the year for this EventSchedule.
	 * @return the year for this EventSchedule.
	 */
	public int getYear() {
		return year;
	}
	/**
	 * Sets the year for this EventSchedule.
	 * @param year The year for this EventSchedule.
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * Returns true if this EventSchedule is hybrid, false if it is not.
	 * @return true if this EventSchedule is hybrid, false if it is not.
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * Sets the month state for this EventSchedule.
	 * @param month this is the month to set for EventSchedule.
	 */
	
	public void setMonth(int month) {
		this.month=month;
	}
	
	/**
	 * Returns the day of this EventSchedule.
	 * @return day of this EventSchedule.
	 */
	public int getDay() {
		return day;
	}
	/**
	 * Sets the day of this EventSchedule.
	 * @param day The day of this EventSchedule .
	 */
	public void setDay(int day) {
		this.day = day;
	}
	
	/**
	 * @return A String representation of this EventSchedule, each field is separated 
	 * by a comma in the order of year, month, day
	 */
	public String createReport() {
		return String.format("EventSchedule, " + "year: %d, Month: %d, Day: %d%n",year,month,day);
	}
}
