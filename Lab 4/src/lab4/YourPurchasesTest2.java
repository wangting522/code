package lab4;


import s23lab4.YourPurchases;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class YourPurchasesTest2 {

	private static final double EPSILON = 1E-12;
	
    @Test
    public void testRecordPurchase() {
        YourPurchases purchases = new YourPurchases();
        purchases.recordPurchase(1.5);
        double purchaseResult = purchases.getPurchase();
        double expected = 1.5;
        Assert.assertEquals(expected, purchaseResult, EPSILON);
    }
    @Test
    public void testReceivePayment() {
        YourPurchases purchases = new YourPurchases();
        purchases.receivePayment(5, 2, 1, 0, 0);
        double paymentResult = purchases.getPayment();
        double expected = 5 + 2 * YourPurchases.QUARTER_VALUE + YourPurchases.DIME_VALUE;
        Assert.assertEquals(expected, paymentResult, EPSILON);
    }
	
	//THIS TEST WOULD FAIL. 
	// TODO: WRITE ONE OR MORE TESTS TO SYSTEMATICALLY FIND THE SOURCE OF THE TEST FAILURE 
	@Test
	public void testCalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double expected = 3.50;
	    Assert.assertEquals(expected, changeResult, EPSILON);
		assertTrue(true);
		
	}
	
// YOUR TASKS ARE STATED HERE: 
// RUN THE TEST CASE IN YourPurchasesTest2.java, TO SHOW AN EXAMPLE OF AN UNSUCCESSFUL EXECUTION
// IMPROVE THIS CODE BY SYSTEMATICALLY ADDING MORE individual TEST CASES 
// (NOT ALREADY STATED IN THIS CODE) TO LOCATE THE METHOD THAT IS CAUSING THE TEST FAILURE
// ADD NEW TEST CASES HERE!!!
	@Test
	public void testGiveChange() {
		YourPurchases register = new YourPurchases();
		register.recordPurchase(0.75);
		register.recordPurchase(1.50);
		register.receivePayment(2, 0, 5, 0, 0);
		double expected = 0.25;
		double changeResult = register.giveChange();
	  Assert.assertEquals(expected, changeResult, EPSILON);
	}
	@Test
	public void testzeroBalance() {
		YourPurchases register = new YourPurchases();
		register.recordPurchase(2.25);
		register.recordPurchase(19.25);
		register.receivePayment(21, 2, 0, 0, 0);
	  Assert.assertEquals(0, register.giveChange(), EPSILON);
	}
}

