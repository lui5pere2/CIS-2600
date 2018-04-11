/*
*Programmer: Luis Perez
*ClassID: Perezl96
*Exercise 7
*CIS 2600: Business Application Programming
*Spring 2018
*Due date: 4/10/2018
*Date completed: 4/10/2018
*******************************
*  Using Try and Catch to detect for wrong user input while doing something. 
*  In our case we are doing division and if the user enter a letter instead of number it wll fail.
*******************************
*/
package ex7luisperez;

/**
 * @author luisperez
 */

//Importing the information for GUI Output. JOptionPane allows to have a windows prompt for answers
import javax.swing.JOptionPane;
public class Ex7LuisPerez {

    public static void main(String[] args) 
    {
     // Having intengers as imputs
     int denominator = 0;
     int numerator = 0;
     int result= 0;
     String InputString;
     
    // Every time we add a try we must include a catch. An addutional catch is not require.
    // Look at lecture 11
    try 
    {
      //variable is an intenger  
      InputString = JOptionPane.showInputDialog(null,"Enter your first number (numerator):");
      numerator= Integer.parseInt(InputString);
      InputString = JOptionPane.showInputDialog(null,"Enter your second number(denominator):");
      denominator= Integer.parseInt(InputString);
      result = numerator/denominator; 
    }
    
    // in case anything goes wrong
    catch (ArithmeticException exception)
    {
      JOptionPane.showMessageDialog(null, exception.getMessage());
      result =0;
    }
    
    catch(NumberFormatException exception)
     {
       JOptionPane.showMessageDialog(null, "Please enter number only!");      
     }
     // Shows result of the math
     JOptionPane.showMessageDialog(null, numerator + " / " + denominator + "\nResult is " + result);
     }
   
}
