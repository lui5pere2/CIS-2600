/*
*Programmer: Luis Perez
*ClassID: Perezl96
*Exercise 5
*CIS 2600: Business Application Programming
*Spring 2018
*Due date: 3/13/2018
*Date completed: 3/13/2018
*******************************
*  This activity is to tell if the user enters the wrong number.
*******************************
*/

package ex5luisperez;

/**
 *
 * @author luisperez
 */

import java.util.Scanner;
public class Ex5LuisPerez{

    public static void main(String[] args) 
    {
        int UserEntry;
        final int HighLimit = 3;
        final int LowLimit = 1;
        
        Scanner inputKeyboard = new Scanner (System.in);
        
         //This line will  ask the user to output the a number  
        System.out.print("Please enter a number no higher than "+HighLimit+": ");  
        
        UserEntry = inputKeyboard.nextInt();
        while (UserEntry > HighLimit || UserEntry < LowLimit)
        {
         System.out.print("the number you entered is too high, Please enter a "
                 + "number below " + HighLimit + ": ");
         UserEntry = inputKeyboard.nextInt(); 
        }
         System.out.print(" The number you entered is correct " );
    }
}

