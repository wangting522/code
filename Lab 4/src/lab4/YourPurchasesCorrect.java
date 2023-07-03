package lab4;
import s23lab4.YourPurchases;
public class YourPurchasesCorrect extends YourPurchases {
    @Override
    public double CalculateChange() {
        double change = super.getPayment() - super.getPurchase(); // Accessing parent class's purchase and payment values

        return Math.abs(change); // Returns the absolute value of the change
    }
}

