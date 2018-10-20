/*
*Programmer: Luis Perez
*ClassID: Perezl96
*Lab 4
*CIS 2600: Business Application Programming
*Spring 2018
*Due date: 4/20/2018
*Date completed: 4/20/2018
*******************************
* When the user selects No (N) to insurance, it will move to this class, where
* we are doing calcualtions to calculate shipping.
*******************************
*/
// If user says NO to insurence
package lab4_perez;
import javax.swing.JOptionPane;
public class Package 
{   
//Declare variables 
 String CustomerName = "";
 int Weight = 0;
 String ShippingMethod;
 // we start counting from 0 so 2.00, 1.50 and 0.50 are 0 and so on
 double [] AirCost= {2.00,3.00,4.50};
 double [] TruckCost= {1.50,2.35,3.25};
 double [] MailCost = {0.50,1.50,2.15};
 double Cost = 0.0;
 String shipping;
 
    //this a default contructor method for the class
    Package (String Customer, int w, String method)
    {
      // variables of the program
      CustomerName = Customer;   
      Weight = w;
      ShippingMethod = method;
    }
    
    // method to retrieve the information attach to ShippingMethod variable
    public void setShippingMethod( String ShippingMethod)
    {
        // Switch statement to check every  value of a varaibles
        switch(ShippingMethod) 
        {
            // case of the String A reffering to the Air selection    
            case "A":case "a": shipping = "Air"; 
            break;
            // case of the String T reffering to the Truck selection    
            case "T":case "t": shipping = "Truck"; 
            break;
            // case of the String M reffering to the Mail selection    
            case "M": case "m": shipping = "Mail";
            break;
            // Line is an interface for the switch case to stop
            default:
            // It will output the message below in case of the test is wrong     
            JOptionPane.showInputDialog(null,"Invald entry, Please try again:");   
        }
    }
    
    //Get method for the ShippingMethod we will use in the main class
    public String getShippingMethod()
    {
      // Return method for the get ShippingMethod method
      return shipping;  
    }
    
    // Set method that we will retrieve the information attach to the Weight 
    public void setWeight(int w)
    { 
      Weight =w;      
    }
    
    // Get method for Weight in main class to do so we will use a return method
    public int getWeight()
    {
      return Weight;   
    }
    //**************DEPENDING ON THE WEIGHT PRICE CHANGES**********************
    //**************WE REAPEAD THE SAME PROCCESS FOR A,T, M.********************
    public void Cost()
    {
        // Switch statement will allow the value to be check in every case 
        switch(ShippingMethod) 
        {
            // Case for the String A reffering to the Air selection    
            case "A": case "a":
            {
                // If package weight is between 1 and 8, then cost will be 2.00
                if (Weight>=1 && Weight <= 8) 
                {
                // Cost will value the attach to the AirCost
                Cost = AirCost[0];  
                } 
                // If package weight is between 9 and 16, then cost will be 3.00
                else if(Weight>=9 && Weight<= 16)
                {
                // Cost will value attach to the AirCost
                Cost = AirCost[1];   
                }
                // If package weight is over 17, then cost 4.50
                else if(Weight>=17)
                {
                // attach to the AirCost AirCost is an array
                Cost = AirCost[2];   
                }
            // Break statement stop the switch to continue
            break;
            }
            
            // Case of the String T reffering to the Truck selection    
            case "T": case "t":
            {
                // If package weight is between 1 and 8, then cost will be 1.50
                if (Weight>=1 && Weight <= 8)
                {
                // the Cost will value the attach to the TruckCost
                Cost = TruckCost[0];   
                } 
                // Check the Weight of the package between 9 and 16
                else if(Weight>=9 && Weight<= 16)
                {
                // the Cost will value the attach to the TruckCost
                Cost = TruckCost[1];   
                }
                // Check the Weight of the package is over 17 to continue
                else if(Weight>=17)
                {
                // the Cost will value the attach to the TruckCost
                Cost = TruckCost[2];   
                }
            //this is a break statement that stop the switch to continue
            break;
            }
     
            // case of the String M reffering to the Mail selection    
            case "M": case "m":
            {
                // Check the Weight of the package is between 1 and 8 
                if (Weight>=1 && Weight <= 8)
                {
                // the Cost will value the attach to the MailCost
                Cost = MailCost[0];  
                }
                // Check the Weight of the package between 9 and 16
                else if(Weight>=9 && Weight<= 16)
                {
                // the Cost will value the attach to the MailCost
                Cost = MailCost[1]; 
                }
                // Check the Weight of the package is over 17 to continue
                else if(Weight>=17)
                {
                // the Cost will value the attach to the MailCost
                Cost = MailCost[2];  
                }
            //this is a break statement that stop the switch to continue
            break;
            }
        } 
    }
     //************************************************************************
    // Return method for get Cost method, allow the method to return to the app
    public double getCost()
    {
      // Return method for get Cost. Allow the method to return to the app
      return Cost;
    }
    
    //this is the Display method know as constructor it will hold no data field
    public void display() 
    {
    // Output message to display all the values, insert into JOption pane output.
    JOptionPane.showMessageDialog(null,
        // getting customer name and weight from Lab4 class      
        "\nName: " + CustomerName +
        "\nWeight (oz): " + getWeight() + " OZ" +
        "\nShipping Method: " + ShippingMethod +
        "\nTotal Shipping Cost: $"+ getCost());  
    }
}