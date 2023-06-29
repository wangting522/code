/*
 * Student Name: Ting Wang
 * Lab Professor: Wafa Hasanain
 * Due Date:October 7
 * Assessment: Assignment 01
 */
/* Description: this class is to calculate the volume of cone. */
public class Cone {
 private double height;
 private double radius;
 Cone(){
	 height = 0;
	 radius = 0;
 }
 Cone(double height,double radius){
	 this.height=height;
	 this.radius=radius;
 }
 public double getHeight(){
	 return this.height;
}
 public void setHeight(double height) {
	 this.height = height;
 }
 public double getRadius(){
	 return this.radius;
}
 public void setRadius(double radius) {
	 this.radius=radius;
 }
 /*
  * This method shows how to calculate the volume of cone
  * Reference:
  * CUEMATH: Volume of Right Circular Cone
  * https://www.cuemath.com/measurement/volume-of-right-circular-cone/ 
  * (Accessed September 24,2022)
  */
public double calculateVolume() {
	double volume;
	volume=1.0/3* Math.PI* height * Math.pow(radius,2);
	return volume;
}
}