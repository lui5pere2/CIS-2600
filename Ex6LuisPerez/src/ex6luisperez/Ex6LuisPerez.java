
/*
*Programmer: Luis Perez
*ClassID: Perezl96
*Exercise 6
*CIS 2600: Business Application Programming
*Spring 2018
*Due date: 3/20/2018
*Date completed: 3/20/2018
*******************************
*  Build my own list and make the computer change the order.
*******************************
*/
package ex6luisperez;

/**
 *
 * @author luisperez
 */
public class Ex6LuisPerez {

    public static void main(String[] args) 
    {
   //declaring the variable with in this case, array holding 15 elements 
        String [] ToVisit =
        {

        "Temples of Angkor, Cambodia",
        "Great Barrier Reef, Australia",
        "Machu Picchu, Peru",
        "Great Wall of China",
        "Taj Mahal, India",
        "Grand Canyon National Park, USA",
        "Colosseum, Italy",
        "Iguazú Falls, Brazil - Argentina",
        "Alhambra, Spain",
        "Aya Sofya, Turkey",
        "Fez Medina, Morocco",
        "Twelve Apostles, Australia",
        "Petra, Jordan",
        "Tikal, Guatemala",
        "British Museum"
      };
        
        final int Place = 0;
        
        //Output the message, which is announcing how the array should be displayed 
        System.out.println("Strings from the first to the last element of subscript: ");
        
        //Loop will allow the user to use the array for the first to the last element. 
        //this loop will use all the value element of that string array named ToVisit. 
        for(String val: ToVisit)
        {
        //this line will output the elment of attached to the variable val
        // which contain the the intial value of the ToVisit
         System.out.println(val); 
        }
        
        System.out.println();
        
       //Output the follwoing message
       System.out.println("Strings from the last to the first element"
                + " of subscript: ");  
       
     //For loop that will be used to allow the user to decrement
     // the value assign to the that x. that x value hold 14 elements  
       for(int x= 14; x >= Place;--x)
       {
        //Output the all the elements of the array 
           System.out.println(ToVisit[x]);
       }  
    }
}
