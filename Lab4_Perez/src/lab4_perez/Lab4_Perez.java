/*
*Programmer: Luis Perez
*ClassID: Perezl96
*Lab 4
*CIS 2600: Business Application Programming
*Spring 2018
*Due date: 4/20/2018
*Date completed: 4/20/2018
*******************************
*  Main class of the the activity. The purpose of this is page is to ask user for
* for questions and depending on whether they want to insuranced their shipment
* it will change to a different class. We are using JOption to show message and
* asking for Input.
*******************************
*/
package lab4_perez;
//Importing the JOption which is to make a windown to interact with user
import javax.swing.JOptionPane;
public class Lab4_Perez 
{

    public static void main(String[] args) 
    {
        //Declaring variables
        String CustomerName ="";
        String ShippingMethod= "";
        int Weight =0;
        String InsuranceOption= "";
        String inputString ="";
    
        //.showMessageDialog to only show message
        JOptionPane.showMessageDialog(null, "Welcome to Loop Transportation");
        // Ask user for name 
        CustomerName = JOptionPane.showInputDialog(null, "Enter your Name");
        
        //*******************QUESTION ABOUT WEIGHT******************************
        // Try statement that will use to catch mistakes
        try
        {
          //output the message for the package Weight
          inputString = JOptionPane.showInputDialog(null, "Please enter the Package Weight (oz)");
          //this retrieve all the information attach to the the value. Intenger.
          Weight = Integer.parseInt(inputString); 
        }
        
        //Catch statment will catch any mistake like a non-intengere 
        catch(NumberFormatException exception)
        {
          // Output message to show wrong input
          JOptionPane.showInputDialog(null,
          "Wrong number, Please enter the Package Weight (oz)");
        }
        //**************QUESTION ABOUT SHIPPING METHOD**************************
        // Loop that will check for the shipping method  
        while(!ShippingMethod.equals("A")&&!ShippingMethod.equals("T")
           && !ShippingMethod.equals("M"))
            {
            // Try statement that will use to catch some mistakes 
            try
            {
              // Shipping mehtod will retrieve the information assign to as string
              ShippingMethod = JOptionPane.showInputDialog(null,
              "Please Select a Shipping Method:(A)ir, (T)ruck or (M)ail:");  
            }
            
            // Catch some mistake user can make
            catch(Exception mistake)
            {
              // In case input is wrong. Output message
              JOptionPane.showInputDialog(null,"Wrong Choice, Please select between"
              + "Air, Mail or Truck");   
            }
        }
        //*********************QUESTION ABOUT INSURANCE*************************
        // Loop that will check user input in insurance whether Y or N.
        while(!InsuranceOption.equals("Y")&&!InsuranceOption.equals("N"))
        {
          // Output to ask the user for an input in insurance 
          InsuranceOption = JOptionPane.showInputDialog(null,
             "Would like to insure the package (Y/N)?");   
        }
        
        // makes the information move the the other packages
        if (InsuranceOption.equals("N"))
        {
          // When no insurance requested, move the package class
          Package uninsured = new Package(CustomerName, Weight, ShippingMethod);  
          uninsured.Cost();
          uninsured.display();  
        }
        
        // Check we get anything different from N
        else
        {
          //If the users wants insurance, move to the InsuredPackage
          InsuredPackage insured = new InsuredPackage(CustomerName,
            Weight, ShippingMethod);
            insured.costOfInsurance();
            insured.display();
        }
    }
}