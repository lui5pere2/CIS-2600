/*
*Programmer: Luis Perez
*ClassID: Perezl96
*Exercise 2
*CIS 2600: Business Application Programming
*Spring 2018
*Due date: 1/23/2018
*Date completed: 1/23/2018
*******************************
We are coding the Scanner by imporing the file from somewhere else that we 
stored to be used in other files.
*******************************
*/
package ex2luisperez;

import java.util.Scanner;
//If the line is underline in yellow it means that the class is not being used
public class Ex2LuisPerez
{

    public static void main(String[] args) {
        String name;
        int int1;
        int int2;
        
        Scanner inputDevice = new Scanner(System.in);
        
        System.out.println("==========================================");
        //Nothing special about this jus some lines to devide the sections
        //if we need to show something on the next line we use PRINTLN
        
        System.out.print("Please enter your name >> ");
//Ask the user for name
        name = inputDevice.nextLine(); //get the name input
        
        System.out.print("Please enter an intenger >> ");//Ask user for number
        int1 = inputDevice.nextInt();
        
        System.out.print("Please enter another intenger >> ");//Ask for number
        int2 = inputDevice.nextInt();
        
        System.out.println("==========================================");
        
        System.out.println("Hey " + name + " here are your answers:");
        //Will grab the name of the user and it will add more text by using +
        
        System.out.println(int1 + " + " + int2 + " is " + (int1 + int2));
        System.out.println(int1 + " - " + int2 + " is " + (int1 - int2));
        System.out.println(int1 + " * " + int2 + " is " + (int1 * int2));
        System.out.println(int1 + " / " + int2 + " is " + (int1 / int2));
        System.out.println(int1 + " % " + int2 + " is " + (int1 % int2));
        //Calculations basically grab the data from the use and do the 
        //calculations depending on what we ask.
        
        System.out.println("==========================================");
        //Addition = intenger1 * intenger2;
        
    }
    
}
