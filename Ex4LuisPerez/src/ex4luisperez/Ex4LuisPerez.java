/*
*Programmer: Luis Perez
*ClassID: Perezl96
*Exercise 4
*CIS 2600: Business Application Programming
*Spring 2018
*Due date: 2/27/2018
*Date completed: 2/27/2018
*******************************
*  Using Command Line Interface we are going to make the user interact the our
* application by asking several questions based on employess comission
*******************************
*/

package ex4luisperez;

import java.util.Scanner;

public class Ex4LuisPerez {

    public static void main(String[] args) {
        
        //Declare every variable of the program and initialize them
     final double MaxSale = 5000; 
     final double MinSale = 3000;  
     final double LowCommision = 0.10;
     final double HighCommission = 0.20;
     double saleAmount = 0.0;
     double commissionRate = 0.0;
     final double NoCommission= 0.0;
     double totalCommissionAmount= 0.0;
     // Retrieve all the information
     Scanner inputKeyBoard= new Scanner(System.in);
     
     // Print to the user screen
    System.out.println("With weekly sales between $3000 and $4999.99 you receive");
    System.out.println("10% commission. With Sales of $5000 or more you receive 20% commission.");
    System.out.println("We will calculate your commision for this week.");
    System.out.println("================================================");
    
    //the system will ask user the following question 
    System.out.print("How much sales did you do this week : $");
    
    //using the information attach to the saleAmount to print them
    saleAmount= inputKeyBoard.nextDouble();
   
     System.out.println("================================================");
     
     //test if the sale made this week will be less than min amount 
     if(saleAmount<MinSale)
     {
         //if true variable will pass no commission to the user if the 
         commissionRate = NoCommission; 
     //no commision statement display here
     System.out.println("Nope. Try next week.");
     }
     // in case is wrong, we need else to keep the program running 
     else
     {
         //test if the sale is above or equal to $3k and below $5k
        if (saleAmount>=MinSale && saleAmount < MaxSale)
        {
            //this variable will pass a low commission which is 10%
            commissionRate =LowCommision;
        }
        else
        {
            
            commissionRate= HighCommission;
        }
     totalCommissionAmount = saleAmount * commissionRate;
    
 
    System.out.printf("Total Weekly Sales is: ", saleAmount);
    System.out.println("Your commission rate is : " + commissionRate);
    System.out.printf("The total commission is: "+totalCommissionAmount+"\n");
    
   //This line will be printong the line between "" 
   System.out.println("================================================"); 
         
     }
   }
}
    

