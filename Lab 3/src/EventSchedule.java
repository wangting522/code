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
 * This class is named EventSchedule Class. It shows constructor chaining using keyword "this".
 * In this code, the simpler constructors all call the more complex one, thereby
 * chaining the calls 'UPWARDS' (from the default constructor to the one 
 * with the most arguments. Ensure that you implement it in this order). 
 
 * EventSchedule() calls EventSchedule(int, int, int), program flow returns to
 * EventSchedule() and exits the constructor.
 * 
 * EventSchedule(int) calls EventSchedule(int, int, int), program flow returns
 * to EventSchedule(int) and exits the constructor.
 * 
 * EventSchedule(int, int) calls EventSchedule(int, int, int), program flow
 * returns to EventSchedule(int, int) and exits the constructor.
 * 
 * EventSchedule(int, int, int) just assigns the values.
 * 
 * NOTE: The constructors in this code have System.out.println(a-message) in them,
 *       for demonstration purposes only. DO NOT PUT input / output
 *       into constructors in real production code!!!
 * 
 * @see  EventSchedule2
 * @author TING WANG
 */
import java.time.LocalDate;
public class EventSchedule {

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
	public EventSchedule() {
    this(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth());
		System.out.println("EventSchedule() was called");
	}
	
	/**
	 * This constructor sets the year as passed, month to current month,
	 * and day to current day.
	 * @param year The year of this EventSchedule.
	 */
	
	public EventSchedule(int year) {
    this(year, LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth());		
		System.out.println("EventSchedule(int) was called");
	}
	
	/**
	 * This constructor sets the year as passed, month as passed,
	 * and day to current day.
	 * @param year The year of this EventSchedule.
	 * @param month of this EventSchedule.
	 */
	
	public EventSchedule (int year,int month) {
    this(year,month, LocalDate.now().getDayOfMonth());
		System.out.println("EventSchedule(int, int) was called");
	} 
	
	/**
	 * This constructor sets the year as passed, month as passed, and
	 * day as passed.
	 * @param year The year of this EventSchedule.
	 * @param month of this EventSchedule.
	 * @param day of this EventSchedule.
	 */
	
	public EventSchedule(int year, int month, int day) {
		this.year=year;
		this.month=month;
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
	
	/** START CODE HERE */
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
