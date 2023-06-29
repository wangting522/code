/*
 * Author/modified by: TING WANG
 * Professor: Wafa Hasanain
 * Date: December 8
 * Description: Lab Exam 02 (22F) Section 312
 */
/*
 * this class represents a TileFloor
 */

public class TileFloor {
	private int numberOfTile;  
	private double pricePerTile; // in dollar
			
	/*
	 * no argument constructor, sets fields to zero
	 */
	public TileFloor() {
		this(0,0.0);
	}
			
	/*
	 * argument constructor
	 */
	public TileFloor(int numberOfTile, double pricePerTile) {
		this.numberOfTile = numberOfTile;
		this.pricePerTile = pricePerTile;
	}
		
	/*
	 * accessor for numberOfTile
	 */
	public int getNumberOfTile() {
		return numberOfTile;
	}
		
	/*
	 * mutator for numberOfTile 
	*/
	public void setNumberOfTile(int numberOfTile) {
		this.numberOfTile = numberOfTile;
	}
		
	/*
	 * accessor for pricePerTile
	 */
	public double getPricePerTile() {
		return pricePerTile;
	}
		
	/*
	 * mutator for pricePerTile 
	 */
	public void setPricePerTile(double pricePerTile) {
		this.pricePerTile = pricePerTile;
	}

	/*
	 * This worker method calculates the cost of tiles 
	 * for a floor, based on price per tile and number of tiles 
	 * using the numberOfTile and pricePerTile fields.
	 */
	public double calculateTotalCost() {
		double totalCost = this.numberOfTile * this.pricePerTile;
		return totalCost;
	}
			
	/*
	 * this method use decision structure to check the value and return a report
	 */
	public String checkTotalCost(){
		String report;
		if(calculateTotalCost() < 0) {
			report = "total cost invalid";
		}
		else 
			if(calculateTotalCost() > 312) {
			   report = "total cost too high";
		}
		else {
			report = "total cost within range";
		}
		return report; 
	}
	//ToDo: call calculateTotalCost to obtain the value
	// decide on the report to return, a value less than 
	// zero reports "total cost invalid",
	// a value more than 312 reports "total cost too high", 
	// a value between 0 to 312 (inclusive)
	// would report "total cost within range".
	// return the actual report
			
}
