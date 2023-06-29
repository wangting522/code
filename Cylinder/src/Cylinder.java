
public class Cylinder {
 private double height;
 private double radius;
 Cylinder(){
	 height = 0;
	 radius = 0;
 }
 Cylinder(double height,double radius){
	 this.height=height;
	 this.radius=radius;
 }
 public double getHeight(){return this.height;}
 public void setHeight(double height) {
	 this.height = height;
 }
 public double getRadius() {return this.radius;}
 public void setRadius(double radius) {
	 this.radius=radius;
 }
public double calculateArea() {
	double area;
	area=2* Math.PI * this.radius * this.height +2 *Math.PI* Math.pow(radius,2);
	return area;
}
}