/*************************************
* Programmer: Luis Perez
* classID: perezl96
* Lab1: 
* CIS 2600: Business Application Programming
* Spring 2018
* Due date: 2/6/18
* Date completed: 2/6/18
**************************************
* Program Explanation
* this program will be use to do display an invoice for a purchased product. 
* It will detail the different component of the invoice in order to give
* the customer a detailed invoice of the purchase. 
* The program will calculate the hours work, the cost of the material and with 
* all the different information an arithmetic calculation will be perform 
* to display the final price with and shipping price added to it.
**************************************/

package lab1_perez;

/**
 *
 * @author Perezl96
 * 
 */

//this line is a class that will give all the necessary information
import java.util.Scanner;

public class Lab1_Perez {

    public static void main(String[] args) 
    {
     
    //Declaring every variable of the program and initialize 
    String productName;
    double costOfMaterials= 0.0;
    final int SHIPPING_COST= 7;
    int hoursOfWork= 0;
    //double totalPrice = 0.0;
    double newCost =0.0;
    double finalCost= 0.0;
    
    //this retrieve all the information and attach them the keyboard
    // so then can be use to print out on the programm 
    Scanner inputKeyboard = new Scanner (System.in);
   
   //ASCII art design
 System.out.println ("=====================================================");
 System.out.println ("---------------  Where shoppers shop  ---------------");
 System.out.println ("=====================================================");

  
  
  //This line will print input below which is the product name
 System.out.print(" Enter Product Name: "); 
 
//using the information attach to product name
 productName = inputKeyboard.nextLine();
 
 //This line will print input below which is the cost of materials 
 System.out.print(" Enter Cost of materials: $");
 
 //using the information attach to the cost of materials
 costOfMaterials = inputKeyboard.nextDouble();
 
 //This line will print input below which is the hours work 
 System.out.print(" Enter the hour of work for this product: ");
 
 //using the information attach to the first intenger locate in the keyboardd
 hoursOfWork = inputKeyboard.nextInt();
 
 //the method that will perfom the calculation of total cost  
 newCost =calculateTotalCost(costOfMaterials,hoursOfWork);
 
 // this possible because of the return  assign to the method located outside of the main
 finalCost = finalPriceWithShipping(newCost);
 
 //ASCII art design
 System.out.println ("=====================================================");
 System.out.println ("-----------------------------------------------------");
 System.out.println ("=====================================================");
 
 //This line will print input below which is the name of the Shop
  System.out.println(" Your Shoping Report");
  
  //This line will print input below 
  System.out.println(" Product Name: " + productName ); 
  System.out.println(" Cost of materials : $"+ costOfMaterials);
  System.out.println(" Hours spent creating this product: " + hoursOfWork
  + " hour(s) ");  
  System.out.println(" Product price after markup $ " + newCost);
 
 //This line will print input below 
 System.out.println(" Shipping fee: $ " + SHIPPING_COST);
 
 //This line will print input below 
 System.out.println(" Total amount charged to customer $  " + 
         finalCost);
  System.out.println ("=====================================================");
  System.out.println ("-----------------------------------------------------");
//ASCII art design
 System.out.println ("=====================================================");
 
    }
    //we create method that will perfom the calculation of the total cost
    //that method as to be outside the main method 
    
        public static double calculateTotalCost(double cost, 
                double hoursWorked)
        {
        //we declare all the variable that we are using in this
       // method and we initialize them 
       double newCost;
       final double MARK_UP = 12.00;
      newCost= cost + MARK_UP * hoursWorked;
       
      //this method that we create is return type which will 
      // the method to the main method in order to perform the calculation
      //of the total cost 
       return newCost;
        }
    
    // we create a method that will the calculation of the final price
    // 0f the product using the the shipping cost 
    //that mehod has to be outside of the main method
    public static double finalPriceWithShipping( double lastPrice)
    {
       //we declare all the variable that we are using in this
       // method and we initialize them  
        double price;
        final int shipping = 7;
        double finalPrice;
        
        finalPrice = lastPrice + shipping;
        
      //this method that we create is return type which will 
      // the method to the main method in order to perform the calculation
      //of the final price with the shipping cost
        return finalPrice;
    }      
}