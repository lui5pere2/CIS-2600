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
* This lab will ask the user to choose from a list of 5 items 
* and it will ask for an invoice number between 1000 and 8000.
* We will output a price and an arithmetic calculation will be 
* perform in order to have the final sale.
**************************************/

/**
 * @author luisperez
 */
public class Purchase {
    /*
     * I am delearing the variables I will use in the program. Also, they are
     * private with the intention to only use this class
    */
   private String product;
   private double TAX = 0.05; 
   private double saleTax = 0.0;  
   private double saleAmount = 0.0; 
   private double totalSale = 0.0;
   private int invoiceNumber = 0;
       
   
    /* Method that will retrieve all the information 
       attach to the product variable and will assign an intenger varable 
       name item 
    */
    public void setProduct (int item)
    {
    // Switch statement will allow the value othe varaible to be check every case 
      switch  (item)
      {
         // Cases of the product with the value of different product assign to it 
          case 1: product="Tesla Model S";
          break;
          case 2: product="Tesla Model X";
          break;
          case 3: product ="Tesla Model 3";
          break;
          case 4: product = "Tesla Roadster";
          break;
          case 5: product = "Powerwall";
          break;
          // Interface for the switch case, to stop or switch if invalid 
          default :
          // Output the message below in case of the test is wrong 
          System.out.println(" Invalid choice ");  
      }   
    }
    /* this a get method for the product that we will use in the main class
     to do so we will use a return method
     this will get all the information attach to the product method */ 
   public String getProduct ()
    {
        return product;
    }
    /* this is a set method that we will retrieve all the information 
     attach to the sale amount variable and we will assign an double 
     variable name sale */
    public void setSaleAmount (double sale)
    {
      saleAmount = sale;  
    }
    /* this a get method for the sale amount we will use in the main class
     to do so we will use a return method
     this will get all the information attach to the sale amount method */
    public double getSaleAmount ()
    {
        return saleAmount;
    } 
    /* this is a set method that we will retrieve all the information 
     attach to the total sale method and we will assign an double 
     variable name sale */
    public void setTotalSale (double sales)
    {
      totalSale = sales + saleTax;  
    }
    /* this a get method for the total sale we will use in the main class
     to do so we will use a return method
     this will get all the information attach to the total sale method
    */
    public double  getTotalSale ()
    {
      return totalSale;  
    }
    /*his is a set method that we will retrieve all the information 
     attach to the total sale method and we will assign an intenger
     variable name invoice
    */
    public void setInvoiceNumber (int invoice)
    {
        invoiceNumber = invoice ; 
    }
    /* this a get method for the invoice number we will use in the main class
     to do so we will use a return method
     this will get all the information attach to the invoice number method
    */
    public int getInvoiceNumber ()
    {
      return invoiceNumber;  
    }
    /* this is a set method that we will retrieve all the information 
     attach to the total sale tax method and we will assign an double 
     variable name sales
    */
    public void setSaleTax (double sales)
    {
        saleTax = sales* TAX;
    }
    /* this a get method for the sale tax we will use in the main class
     to do so we will use a return method
     this will get all the information attach to the sale tax method
    */
    public double getSaleTax ()
    {
      return saleTax;  
    }

    void setInvoiceNumber(String invoiceNumber) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}