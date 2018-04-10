/*************************************
* Programmer: Luis Perez
* classID: perezl96
* Lab3
* CIS 2600: Business Application Programming
* Spring 2018
* Due date: 3/30/18
* Date completed: 3/30/18
**************************************
* Program Explanation:
* On the SalesPErson page we are assigning multiple variables to be able to use
* in the CreateSalesPerson.
**************************************/

public class SalesPerson {
    
//Private variable so they can only be use in this class    
private String empID;
private String empName;
private double totalSales;

//this a default contructor method for the Salesperson class that we
//are going to use in the main class by getting all the information
SalesPerson(String ID, String Name,double Sales)
{
//Declare the variables
 empID = ID;
 empName= Name;
 totalSales = Sales;
}
 //set method that we will retrieve all the information attach to the empID 
 //variable and  will assign an String varable named ID
public void setEmpID(String ID)
{
 //we declare the variable
  empID= ID;  
}
//Get method for the EmpID we will use in the main class
 public String getEmpID() 
 {
 //Return method for the get empID method to allow the method to return to the application class
  return empID;   
 } 
// this is a set method that we will retrieve all the information 
// attach to the empName variable and we will assign an String varable 
// called Name 
public void setEmpName(String name)
{
 // we declare the variable and we initialize them for this method
  empName= name;  
}
// this a get method for the EmpName we will use in the main class
// to do so we will use a return method
// this will get all the information attach to the EmpName method
public String getEmpName()
{
// this a return method for the get empName method
// it will allow the method to return to the application class
  return empName;  
}
// this is a set method that we will retrieve all the information 
// attach to the TotalSales variable and we will assign an double varable 
// named sales
public void setTotalSales(double sales)
{
 // we declare the variable and we initialize them for this method
  totalSales= sales;  
}
 //Get method for the TotalSales we will use in the main class
public double getTotalSales()
{
 // this a return method for the get TotalSales method
 // it will allow the method to return to the application class
 return totalSales;   
}
}

