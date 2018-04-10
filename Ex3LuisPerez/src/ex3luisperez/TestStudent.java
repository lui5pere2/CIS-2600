/*
*Programmer: Luis Perez
*ClassID: Perezl96
*Exercise 3
*CIS 2600: Business Application Programming
*Spring 2018
*Due date: 2/6/2018
*Date completed: 2/6/2018
*******************************
Creating a student class that requires to follow some objects 
*******************************
*/

package ex3luisperez;

/**
 *
 * @author luisperez
 */
public class TestStudent 
{//outer block begins
    
final int  schoolYear;
final double gpa;
final String major;
 
 
 public TestStudent (int year, double grade, String program )
 {
  schoolYear = year;
  gpa = grade;
  major= program;
 }
 public  TestStudent(int year, String program)
 {
  schoolYear = year;   
  major= program; 
  gpa = 2.9;
 }
 public TestStudent (int year)
 {
  schoolYear = year;
  major = "CIS";
  gpa= 3.5;
 }

  //Text message that will be display for the user
  public void display()
  {
    System.out.println(" The School year is: "+ schoolYear+ ", current major is "
            +major+ " and my cumulative GPA is: " +gpa);
  }
}//end of outer block
