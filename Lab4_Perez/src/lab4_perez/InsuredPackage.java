/*
*Programmer: Luis Perez
*ClassID: Perezl96
*Lab 4
*CIS 2600: Business Application Programming
*Spring 2018
*Due date: 4/20/2018
*Date completed: 4/20/2018
*******************************
* When the user selects Yes (Y) to insurance, it will move to this class, where
* we are doing calcualtions to calculate shipping and insurance.

* What I have wrong? Some of the calculations are wrong for example on the weight
* whent user enters a big number calculations will not add up. Also, I was not 
* able to display shipping method for the Yes class. 
* Some of the things I tried? comparing Package class with InsuredPackage 
* to be able to get ShippingMethod to work, but it did not.
*******************************
*/
package lab4_perez;
import javax.swing.JOptionPane;
public class InsuredPackage extends Package   
{
  //Declare variables
  double[] Insurance ={2.45,3.95,5.55}; 
  double shippingCost;
  double costOfInsurance;
  String ShippingMethod ="";
  int Weight =0;
  double InCost = 0.0;
  
  public InsuredPackage(String customer,int Weight, String ShippingMethod)
  {
  // Use keyboard in order to call a method in the super class 
  super(customer,Weight,ShippingMethod);
  }
  // Set method that we will retrieve all the information attach to the CostOfInsurance 
  public void setCostOfInsurance( double InsuranceAmount)
  {
  // Declare a variable and the perform the arithmetic calculation
  costOfInsurance = InsuranceAmount;
  }
  // Method for Insurance Cost in the main class
  public double getCostOfInsurance()
  {
   // Return method for the get ShippingMethod method
   return costOfInsurance;
   }
//********************CHEKING FOR INSURANCE COST********************************
   // CostOfInsurance method        
   public void costOfInsurance()
   {
        // Call a method in the super class. Super class is the package
        super.Cost(); 
        // Check from 0 and 1 if true then cost will be 2.45
        if (shippingCost>=0 && shippingCost <= 1) 
        {
            //when the statement is right the Cost will attach to the Insurance
            InCost = Insurance[0];
            // Calculate the cost of Insurance 
            costOfInsurance = InCost + getCost(); 
            setCostOfInsurance(costOfInsurance);
        }
        
        // Check tshipping cost is between 1.01 and 3 if true then it will move 
        else if(shippingCost>= 1.01 && shippingCost <=3)
        {
            // When true check out right then the Cost will attach to the Insurance
            InCost = Insurance[1];
            // Calculate the cost of Insurance and will
            costOfInsurance = InCost + getCost();
            setCostOfInsurance(costOfInsurance);
        }
        // Check tshipping cost is above 3.01 if true it will move to the next line
        else if(shippingCost >3.01)
        {
            // When the statement is right then the Cost will the value attach to the Insurance
            InCost = Insurance[2];
            //this method we will to calculate the cost of Insurance
            costOfInsurance = InCost + getCost();
            setCostOfInsurance(costOfInsurance);
        }
    }
   
    // Override method that we will use to inherit all the information
    @Override
 
    // Display method
    public void display() 
    {
        // Output message display all the value attach
        JOptionPane.showMessageDialog(null,
          // getting customer name and weight from Lab4 class      
          "\nName: "+ CustomerName +
          "\nWeight: "+ getWeight() +" OZ" +
          // ShippingMethod not displaying properly 
          "\nShipping Method: "+ ShippingMethod +
          // under different names but functions works        
          "\nShipping Cost: $"+ getCost() +        
          "\nInsurance Cost: $"+  InCost +
          "\nTotal Shipping Cost: $"+ costOfInsurance); 
    }
}