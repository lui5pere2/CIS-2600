/*
*Programmer: Luis Perez
*ClassID: Perezl96
*Exercise 3
*CIS 2600: Business Application Programming
*Spring 2018
*Due date: 2/6/2018
*Date completed: 2/6/2018
*******************************
Creating a student class that requires to follow some objects. 
This the main method that will contain three student object and they will use a 
different constructor each time they will run
*******************************
*/

package ex3luisperez;

/**
 *
 * @author luisperez
 */
public class Ex3LuisPerez 
{ //Outer block opens

public static void main(String[] args) 
  {//Inner block open
      
  //these are the different object of the method  
  TestStudent first = new TestStudent(2015);
  TestStudent second = new TestStudent(2016,"CIS");
  TestStudent third = new TestStudent (2017 , 3.3 ,"CIS");
  
 //this is a display method for every object 
  first.display();
  second.display();
  third.display(); 
  }//Inner block ends

}//Outer block ends
    
