/**
 * WELCOME TO LAB 3!
 * The essence of this lab is to work with constructors and to show overloaded constructor calls.
 * It demonstrates chaining overloaded constructors using "this" keyword.
 * It helps to consolidate understanding of the chaining rules learned in the theory class
 * This program also displays a good example of writing comments in your code using the Javadoc style.  
 */

/**
 * This is the driver class for this program. This means that it just runs the 
 * application with a method main.
 * @author TING WANG.
 */
public class TestDemo {

	/**
	 * This is the entry point for the application, it instantiates 4 EventSchedule
	 * objects to show-case the constructors. Anonymous objects are used and
	 * each one is only retained long enough to call method create report on
	 * each. No variable names were used, just new Constructor().methodCall().
	 * @param args Command line arguments are not used by this program.
	 */
	
	/**
	 * YOUR TASK: COMPLETE THE CODE FOR THIS DRIVER CLASS NAMED TestDemo.
	 * Hint:  See the SampleOutput file provided for the print statements required.
	*/

	public static void main(String[] args) {

		System.out.println("VERSION 1"+ "\n");
		
		System.out.println("EventSchedule1");
		System.out.println(new EventSchedule().createReport() + "\n");
		
		System.out.println("EventSchedule2");
		System.out.println(new EventSchedule(2023).createReport() + "\n");

		
		System.out.println("EventSchedule3");
		System.out.println(new EventSchedule(2023,5).createReport() + "\n");

		
		System.out.println("EventSchedule4");
		System.out.println(new EventSchedule(2023,5,30).createReport() + "\n");

		System.out.println("VERSION 2"+ "\n");
		
		System.out.println("EventSchedule5");
		System.out.println(new EventSchedule3().createReport() + "\n");
		
		System.out.println("EventSchedule6");
		System.out.println(new EventSchedule3(2023).createReport() + "\n");

		
		System.out.println("EventSchedule7");
		System.out.println(new EventSchedule3(2023,5).createReport() + "\n");

		
		System.out.println("EventSchedule8");
		System.out.println(new EventSchedule3(2023,5,30).createReport() + "\n");
		
		System.out.println("VERSION 3"+ "\n");
		
		System.out.println("EventSchedule9");
		System.out.println(new EventSchedule3().createReport() + "\n");
		
		System.out.println("EventSchedule10");
		System.out.println(new EventSchedule3(2023).createReport() + "\n");

		
		System.out.println("EventSchedule11");
		System.out.println(new EventSchedule3(2023,5).createReport() + "\n");

		
		System.out.println("EventSchedule12");
		System.out.println(new EventSchedule3(2023,5,30).createReport() + "\n");

	}

}
