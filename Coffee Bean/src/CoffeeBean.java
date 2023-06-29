/*
 * Student Name: Ting Wang
 * Lab Professor: Wafa Hasanain
 * Due Date:October 13
 * Assessment: Lab Exam 01
 * Description: this class is used to create Coffee Bean objects and 
 * calculate the total amount of caffeine in a single coffee bean based on weight.
 */
public class CoffeeBean {
 private double weight;
 private double caffeine;

 //no-argument constructor
 public CoffeeBean() {
	 this(0.0,0.0);
	
 }
 //parameterized constructor
 public CoffeeBean(double weight,double caffeine){
	 this.weight=weight;
	 this.caffeine=caffeine;
 }
//getter for weight
public double getWeight() {
	return weight;
}
//setter for weight
public void setWeight(double weight) {
	this.weight = weight;
}
//getter for caffeine
public double getCaffeine() {
	return caffeine;
}
//setter for caffeine
public void setCaffeine(double caffeine) {
	this.caffeine = caffeine;
}
//helper worker method to calculate the amount of caffeine
public double calculateTotalCaffeine() {
	double totalCaffeine=this.weight * this.caffeine;
	return totalCaffeine;
}
public String checkTotalCaffeine(){
	String report;
	if(calculateTotalCaffeine() < 0) {
		report = "total Caffeine invalid";
	}
	else 
		if(calculateTotalCaffeine() > 313) {
		   report = "total Caffeiene too high";
	}
	else {
		report = "total Caffeine within range";
	}
	return report; 
    //ToDo: call calculatePixelCount to obtain the value
    // decide on the report to return, a value less than 
    // zero reports "total PixelCount invalid",
    // a value more than 313 reports "total PixelCount too high", 
    // a value between 0 to 313 (inclusive)
    // would report "total pixels PixelCount within range".
	// return the actual report
} 
}