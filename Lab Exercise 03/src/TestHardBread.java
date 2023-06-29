/*Description: This class with method main to test 
 * the class HardBread constructors and worker methods.
 */
public class TestHardBread {
	
	public static void main(String[] args) {
		String report;
		double volume;
		HardBread hardBread1 = new HardBread();
		HardBread hardBread2 = new HardBread(2.5, 5.75, 3.45, true);
		
		volume = hardBread1.calculateVolume();
		report=hardBread1.toString();
		System.out.println("Hard Bread 1:");
	    System.out.printf("volume:%.2f%n",volume); 
		System.out.println(report);
	    
		volume = hardBread2.calculateVolume();
		report=hardBread2.toString();
		System.out.println("Hard Bread 2:");
	    System.out.printf("volume:%.2f%n",volume); 
		System.out.println(report);
	
	System.out.println("Program by Ting Wang");
	}
}
