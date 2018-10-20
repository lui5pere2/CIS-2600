/*
*Programmer: Luis Perez
*ClassID: Perezl96
*Exercise 8
*CIS 2600: Business Application Programming
*Spring 2018
*Due date: 4/17/2018
*Date completed: 4/17/2018
*******************************
*  We are aking user for input to move that information insto a .txt file
* that we have linked on our code
*******************************
*/
package ex8luisperez;

/**
 * @author luisperez
 */
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
public class Ex8LuisPerez {


    public static void main(String[] args) 
    {
        //Declare  variable   
        Path file = Paths.get("CustomerList.txt");
        int IDNumber=0;
        String delimiter= "";
        String Customer="";
        String firstName ="";
        String lastName = "";
        double balanceOwned =0.0;
        final int QUIT = 999;

        Scanner input = new Scanner(System.in);
        try
        {
        // these line below will be use to create the buffer abd also open
        OutputStream output = new BufferedOutputStream
        (Files.newOutputStream(file,CREATE));
        BufferedWriter writer = new BufferedWriter
        (new OutputStreamWriter(output));
        
        //this line will be use to outprint the message below 
        System.out.print("Please Enter the ID Number>> ");
        IDNumber= input.nextInt();
        // Loop will be use in order to allow the use to check if 
        // the entry will not be equal to the requirements
        while(IDNumber != QUIT)
        {
        System.out.print("Enter Customer First Name>> ");
        input.nextLine();
        firstName= input.nextLine();
        
        //this line will be use to outprint the message below 
        System.out.print("Enter Customer Last Name>> ");
        input.nextLine();
        lastName = input.nextLine();
        
        //this line will be use to outprint the message below 
        System.out.print("Enter the Balance Owned:$");
        balanceOwned = input.nextDouble();
        
        // this is method that will all the variable for the customer
        Customer= IDNumber + delimiter + firstName + delimiter + lastName + delimiter + balanceOwned;
        writer.write(Customer, 0, Customer.length());
            writer.newLine();
            //this line will be use to outprint the message below 
            System.out.print("Enter next ID number or " + QUIT + " to quit >> ");
            IDNumber = input.nextInt();
        }
        writer.close();
        }
        // this is a catch statement that will allow the user to catch 
        catch (Exception e)
        {  
        //this line will be use to outprint the message below 
       System.out.println("Message: " + e);   
        }
    }
    
}