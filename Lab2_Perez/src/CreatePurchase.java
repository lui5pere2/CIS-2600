/*************************************
* Programmer: Luis Perez
* classID: perezl96
* Lab2
* CIS 2600: Business Application Programming
* Spring 2018
* Due date: 3/16/18
* Date completed: 3/15/18
**************************************
* Program Explanation:
* The idea with this project is to create an invoice generator for Tesla 
* automobile. If the employee at Tesla is cashing out a customer, the employee
* will be able to select the model, create an invoice and insert the cost to 
* generate a final sales amount
**************************************/
/*
 * @author luisperez
*/ 
import java.util.Scanner;
public class CreatePurchase 
{
  public static void main(String[] args) 
  {   
    //Declaring variables of the program
    int invoiceNumber = 0;
    int item = 0;
    double saleAmount = 0.0;
    final int UPPER_LIMIT = 8000;
    final int LOWER_LIMIT = 1000;
       
    // Retrieve all the information
    Scanner input= new Scanner(System.in);
        
    //Retrieve all the information attach the purchase class
    Purchase object = new Purchase();
    //This line will print ASCII art design to give the invoice a better look 
    System.out.println ("=====================================================");
    System.out.println ("---------------------  INVOICE  ---------------------");
    System.out.println ("=====================================================");
    System.out.println ("---------------- Tesla Headquarters -----------------");
    System.out.println ("---------------- 3500 Deer Creek Road ---------------");
    System.out.println ("---------------- Palo Alto, CA 94304 ----------------");
    System.out.println ("=====================================================");
    System.out.println ("-----------------------------------------------------");
    System.out.println ("=====================================================");
       
    // Output will ask the user of the program to select a specific item from the list
    System.out.println("Please select a car of your chose from the list below:");
       
    /* since the user hase to make a choice the next five output  we be
    the name of every item the user have to choose from and 
    they are going from 1 to 5  */
    System.out.println("1. Tesla Model S");
    System.out.println("2. Tesla Model X");
    System.out.println("3. Tesla Model 3");
    System.out.println("4. Tesla Roadster");
    System.out.println("5. Powerwall");
       
    //this output line will ask for the user to now choose an item
    System.out.print("Please select an item from the list below (1 - 5): ");
       
    //using the information attach to item locate in the scanner to print  
    item = input.nextInt();
       
    /* While will run a condition/test for the user to choose a number from the
    list between 1 and 4. The number that the user select can't be greater 
    than 4 or less than 1 */
    while (item >5 || item <1)
       {
         //In case the the test perform in the while loop come back incorret.
         System.out.print(" -Invalid Number. Please enter a valid item number: ");    
         //using the information attach to item locate in the scanner
         item = input.nextInt();  
       }
    //This output line we ask the user to enter an invoice number 
    System.out.print("Please enter the invoice number: "); 
    invoiceNumber= input.nextInt();

    /* this is a while loop that will run a condition or a test on
    the invoice number. the user will have to enter between the an
    upper limit and a lower limit number in order to make the statement
    ture otherwise the program will continue to run until the right 
    number is assign. note that the upper limit is 8000 and the lower
    limit is 1000 so the user will have to choose a number in this range. */
    
     while (invoiceNumber>UPPER_LIMIT || invoiceNumber<LOWER_LIMIT)
       {
           System.out.print(" -Invalid Number. Please enter a valid number "
                   + "higher than "+LOWER_LIMIT+" but lower than "+UPPER_LIMIT+": ");
           invoiceNumber= input.nextInt();
       }
    //this output line will ask the user to enter a sale amount for the item
    System.out.print("Please enter the sale amount: $");
    //using the information attach to sale Amount locate in the scanner 
    saleAmount = input.nextDouble(); 
    
    /* this is a while loop that will run a condition base on the sale amount.
    when the user will enter the sale amount for the the item that they 
    choose this number has to be greater than other otherwise it has to be
    a positive number otherwise the loop will keep on run until the 
    right amount will be enter. */
    while (saleAmount <0)
      {
       /* this output line will be perform when the condition in the while 
       loop is false then message below will be shown to the user */
       System.out.print("Please enter the a positive sales amount: $");   
       //using the information attach to sale Amount locate in the scanner
       saleAmount = input.nextDouble();   
      }
                
     // Different method attach to the all the set interface
     object.setInvoiceNumber(invoiceNumber);
     object.setProduct(item);
     object.setSaleAmount(saleAmount);
     object.setSaleTax(saleAmount);
     object.setTotalSale(saleAmount);

     //this output line will print the message below  
     System.out.println ("The Item Name is: " + object.getProduct());
     System.out.println("The Invoice Number is: "+ object.getInvoiceNumber());
     System.out.println("The Sale Amount is: $" + object.getSaleAmount());
     //for this line it will the get sale tax
     //note this output is a formated one and will have two decimal numbers
     System.out.printf ("The Sale Tax is: $%.2f\n", object.getSaleTax());
     //for this line it will the get total sale
     //note this output is a formated one and will have two decimal numbers
     System.out.printf("The Grand Total is: $%.2f\n", object.getTotalSale());
     //This line will print ASCII art design to give the invoice a better look 
     System.out.println ("=====================================================");
     System.out.println ("-----------------------------------------------------");
     System.out.println ("=====================================================");
  }
}
