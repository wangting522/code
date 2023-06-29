/*
 * Student Name: Ting Wang
 * Lab Professor: Wafa Hasanain
 * Due Date:September 30
 * Assessment: Lab Exercise 02
 */
/* Description: this class is to help car company to track cars in inventory.
 *  Output report that has VehicleIdentificationNumber,Mileage and Invoice Price. 
 */
public class Car {
	private String vehicleIdentificationNumber;
	private double mileage;
	private double invoicePrice;
	
	public String getVehicleIdentificationNumber(){
	    return vehicleIdentificationNumber;
	}
	public void setVehicleIdentificationNumber(String vehicleIdentificationNumber){
	    this.vehicleIdentificationNumber = vehicleIdentificationNumber;
	}
	public double getMileage(){
	    return mileage;
	}
	public void setMileage(double mileage){
	    this.mileage = mileage;
	}
	public double getInvoicePrice(){
	    return invoicePrice;
	}
	public void setInvoicePrice(double invoicePrice){
	    this.invoicePrice = invoicePrice;
	}
	/*
	 * Format the generated String
	 */
	public String toString() {
		String formatString = "%s, %.1f (km), $%.2f";
		String report;
		report = String.format(formatString, 
				vehicleIdentificationNumber, mileage, invoicePrice);
		return report;
	}
}
