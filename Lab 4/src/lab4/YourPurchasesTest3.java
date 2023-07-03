package lab4;


import s23lab4.YourPurchases;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class YourPurchasesTest3 {

	private static final double EPSILON = 1E-12;
	
	//THIS TEST WOULD FAIL. 
	// TODO: WRITE ONE OR MORE TESTS TO SYSTEMATICALLY FIND THE SOURCE OF THE TEST FAILURE 
	@Test
	public void testCalculateChange() {
		YourPurchases aPurchase = new YourPurchasesCorrect();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double expected = 3.50;
	    Assert.assertEquals(expected, changeResult, EPSILON);
		assertTrue(true);
		
	}
	
}
