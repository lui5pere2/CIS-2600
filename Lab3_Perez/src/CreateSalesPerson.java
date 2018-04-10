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
*  In the CreateSalesPerson we are doing the entire layout and code of the
*  activity. The purpose of this lab is to ask a user for three option
*  (Add, Change, Quick) to ask the user for a prompt. Depending on the selection
*  the user will be able enter ID, Name, and sales amount. The user will have
*  the opportunity to edit submitted entries as we have the option to change.
**************************************/

import java.util.Scanner;

public class CreateSalesPerson 
{
    public static void main(String[] args) 
    {
     //Declare variables of the program   
     String choice= "";
     SalesPerson[] person = new SalesPerson[20];
     int count = 0;

     Scanner input = new Scanner(System.in);
    
        // While loop to we use to check the condition of Q (Quit). This loop is 
        // a string condition we are cheching this is why we have a different 
        // format with the .equals
        while(!choice.equals("Q"))
        {
         //the line output will give us a list in which we have to make a choice 
         System.out.println("Hello, choose from the list below:");
         //Add a new record to the progam
         System.out.println("(A)dd");
         //Change/Edit a record on the progam 
         System.out.println("(C)hange");
         //This will quit the program
         System.out.println("(Q)uit"); 
         //Asking user to slect an option
         System.out.println("What would you like to do? ");
         choice = input.nextLine();
    
            //Switch statement will allow the value of a varaible to be check every case 
            switch(choice)
            {
                //Case of the String A reffering to the Add selection    
                case "A": case "a": count = Add(person,count);
                break;
                //Case of the String C reffering to the Change selection     
                case "C": case "c": Change(person, count);
                break;
                //Case of the String Q reffering to the Quit selection     
                case "Q": case "q":
                break;
                //Interface for the switch case will stop in case the switch if invalid    
                default:
                //Output the message below in case of the test is wrong 
                System.out.println("Invalid Choice, please enter the right letter");
             }
        }
    }
    
//constructor method it will hold two data field (Saleperson and intenger count)
public static int Add(SalesPerson[] SalesPersonArray, int count)
{
    //Declare variable  
     String ID= "";
     int IDnumber = 8;
     String Name = "";
     double totalSale =0.0;
     
    
     // Retrieve all the information and attach them the keyboard
     // so then can be use to print out in the program
    Scanner input = new Scanner(System.in);
    
      // If statement that that will check we have 20 positon of the array 
      if (count == 20) 
      {
        // if case the above statement is true then the message below 
        // will be print to notify the user that the array is full 
        System.out.println("No available space");
      }
      // Else statement which is the continuation of the if statement
      // When not full we can then proceed to the next step
      else
       {
         // when the else statement came back true then we will ask the user
         // to enter an ID for the sale person 
         System.out.print("Please enter the ID of the sale person: ");
         
         // Information attach to item locate in the scanner to print them  
         ID = input.nextLine();
         
         //this is a while loop while the length of the ID
         while(ID.length() != IDnumber)
           {             
               System.out.print("Wrong ID Number, Please enter again: ");
                ID= input.nextLine();

               }
         for(int i = 0; i<count;++i)
               {
               if (SalesPersonArray[i].getEmpID().equals(ID)){
               System.out.println("Alredy existing ID");
               System.out.print("Please enter again: ");
                ID= input.nextLine();     
               }
           } 
         // when all the condition in the while has been check then we can
         // ask the user to enter a name for the sale person 
         System.out.print("Please enter your Name: ");   
         //using the information attach to item locate in the scanner to print them  
         //note that this will have to input an string  
         Name = input.nextLine();  
        
    
    // Enter a sale amount for the sale person 
    System.out.print("Please enter your Sales Amount: $");
    //using the information attach to item locate in the scanner to print them  
    totalSale= input.nextDouble();
    //it will also all the information attach from the default constructor 
    SalesPersonArray[count] = new SalesPerson(ID, Name, totalSale);
    // Incrementation

    count++;
       }
    // Display method which will allow the user to display information with the 
    // display method when all the condition have been check
    Display(SalesPersonArray, count);
    // this a return method for the incrementing 
    // it will allow the method to return within the method 
    return count;
}
  //this is the Change method know as constructor it will hold two data field
  // which are the array Saleperson and the intenger count 
  public static void Change (SalesPerson[] SalesPersonArray, int count)
{
    //Declare variable of the program and initialize them  
    String ID ="";
    double totalSale= 0.0;

 
    //this retrieve all the information and attach them the keyboard
    // so then can be use to print out in the program
    Scanner input = new Scanner (System.in);
    // If statement that will check if the count assign to our array is empty 
    if (count ==0)  
    {
       // Message will be print in case the condition of our array is true 
       System.out.println("Empty space");              
    }
    //this is an else statement that will check if the count of the array 
    // is not empty then it will move the print line
     else
    {
       //this will ask the user to enter the ID that he want to change 
       System.out.print("Please enter the ID you want to change:");
       //using the information attach to item locate in the scanner to print them  
       //note that this will have to input an string  
       ID= input.nextLine();
    }
    //this a for loop that will check if the id number exist within the array 
    for (int i=0; i<count; ++i)   
    {
       // If statement will check if the ID we want to change is the correct  ID 
       if(SalesPersonArray[i].getEmpID().equals(ID))
        {
           // Condition above is right, it will ask the user for the sale amount 
           System.out.print("Please enter the Sale Amount: $");
           //Iformation attach to item locate in the scanner to print  
           totalSale = input.nextDouble();
           // Fill the position in the array and retrieves all the information  
           // in the settotalSale and then place them in the right location 
           SalesPersonArray[i].setTotalSales(totalSale);
        }
    }
 // Display method which will allow the user to display information with the 
 // display method when all the condition have been check
Display(SalesPersonArray, count);
}
  
//  Constructor it will hold two data fiel (array Saleperson and  intenger count)
public static void Display(SalesPerson[] SalesPersonArray, int count)    
{
   //this is a for loop that will check the count and the positon within our
   //array in order to to display every element of it 
    System.out.println ("====================================");
    System.out.println ("===============RESULTS==============");
   for (int i=0; i<count; ++i)
    {
        // this is an empty print line that we will to create some space
        // between the different ouput message
        System.out.println();
        //This line will print the line between "" wich is a ASCII art design
        
        //this output line will print the message below and it will possible by the 
        //the get method we have in our Salesperson Class 
        //for this line it will the get ID of the sale person
        System.out.println("ID#: "+ SalesPersonArray[i].getEmpID());
        //this output line will print the message below and it will possible by the 
        //the get method we have in our Salesperson Class 
        //for this line it will the get the name of the sale person 
        System.out.println("Name: "+ SalesPersonArray[i].getEmpName());
        //Output line will print the message and it will possible by the get method 
        //we have in our Salesperson Class for this line it will the get total sale
        System.out.println("Total Sales:$"+SalesPersonArray[i].getTotalSales());
            }
   System.out.println ("*************************************");
}
}


