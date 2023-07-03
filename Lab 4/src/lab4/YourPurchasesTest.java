package lab4;

import org.junit.Test;
import s23lab4.YourPurchases;

import org.junit.Assert;

public class YourPurchasesTest
{
   private static final double EPSILON = 1E-12;

   @Test public void testGetPurchase()
   {
      YourPurchases register = new YourPurchases();
      register.recordPurchase(0.75);
      register.recordPurchase(1.50);
      double expected = 2.25;
      Assert.assertEquals(expected, register.getPurchase(), EPSILON);
    }
   
// YOUR TASKS ARE STATED HERE: 
// RUN THE CODE YOU RECEIVED AND DEMO THAT THERE IS NO ERROR in YourPurchasesTest.java 

  
     
   }
