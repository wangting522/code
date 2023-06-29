/*
 * Student Name: Ting Wang
 * Lab Professor: Wafa Hasanain
 * Due Date:October 21
 * Assessment: Lab Exercise 03
 */
/* Description: this class is to calculate the volume of HardBread 
 * in order to determine an optimal packaging size.  
 */
public class HardBread {
 public double MAX_LENGTH =10.5;
 public double MAX_WIDTH = 10.5;
 public double MAX_DEPTH = 5.5;
 private double length;
 private double width;
 private double depth;
 private boolean isSalted;
 
 HardBread(){
	 this.length= MAX_LENGTH;
	 this.width = MAX_WIDTH;
	 this.depth= MAX_DEPTH;
	 this.isSalted=true;
 }
 HardBread(double length,double width, double depth,boolean isSalted){
	 this.length= length;
	 this.width = width;
	 this.depth= depth;
	 this.isSalted=isSalted;
}
public double getLength(){
	 return length;
}
public void setLength(double length) {
	 this.length = length;
}
public double getWidth(){
	 return width;
}
public void setWidth(double width) {
	 this.width=width;
}
public double getDepth(){
	 return depth;
}
public void setDepth(double depth) {
	 this.depth=depth;
}
public boolean isSalted(){
	 return isSalted;
}
public void setSalted(boolean isSalted) {
	 this.isSalted=isSalted;
}
//Calculations for class HardBread are based on a rectangular cube, with length, width, depth. 
public double calculateVolume(){
	 return length*width*depth;

}
public String toString() {
	  String report = String.format("Length %.2f,Width %.2f, Depth %.2f, Volume %.2f",this.length,this.width,this.depth,calculateVolume() );
	  return report;
}
}