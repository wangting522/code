///*
// * Student Name: Ting Wang
// * Lab Professor: Wafa Hasanain
// * Due Date:October 13
// * Assessment: Lab Exam 01
// * Description: this class is used to test CoffeeBean class.
// */
//import java.util.Scanner;//import class Scanner
//
//public class TestCoffeeBean {
//    /*
//	 * The main method input two values which are set into the instance of coffeebean, 
//	 * the values are retrieved and output. The returned value of the worker method is also output.
//	 */
//	public static void main(String[] args) {
//		Scanner keyboard = new Scanner(System.in);
//		double weight; 
//		double caffeine;
//		
//		System.out.printf("enter weight of bean (milligrams): ");
//		weight = keyboard.nextDouble();
//		
//		System.out.printf("enter caffeine per milligram of coffee (milligrams): ");
//		caffeine = keyboard.nextDouble();
//		
//		CoffeeBean coffee = new CoffeeBean(weight, caffeine);
//		
//		System.out.printf("getWeight() reports:%.1f %n", coffee.getWeight());
//		System.out.printf("getCaffeine() reports:%.3f %n", coffee.getCaffeine());
//		System.out.printf("calculateTotalCaffeine() reports:%.4f %n", coffee.calculateTotalCaffeine());
//		System.out.println("Program by Ting Wang");
//		
//		keyboard.close();
//
//		}
//}
