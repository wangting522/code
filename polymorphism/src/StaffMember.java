
//Represents a generic staff member. What type of class is this? superclass
//********************************************************************

abstract public class StaffMember
{
protected String name;
protected String address;
protected String phone;

//-----------------------------------------------------------------
//  Constructor: Sets up this staff member using the specified
//  information.
//-----------------------------------------------------------------
public StaffMember(String eName, String eAddress, String ePhone)
{
  name = eName;
  address = eAddress;
  phone = ePhone;
}		

//-----------------------------------------------------------------
//  Returns a string including the basic employee information.
//-----------------------------------------------------------------
public String toString()
{
   String result = "Name: " + name + "\n";

   result += "Address: " + address + "\n";
   result += "Phone: " + phone;

   return result;
}

//-----------------------------------------------------------------
//  Derived classes must define the pay method for each type of
//  employee.
//-----------------------------------------------------------------
public abstract double pay(); 
}		
//the method does not have an implementation in the current class 
//and must be implemented their own way by any concrete subclass.