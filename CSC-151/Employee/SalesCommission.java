//FVCproductions
//March 27, 2014

/*
class calculates salesperson's gross pay
based on amount of sales
*/

public class SalesCommission {

  private double sales,           // monthly sales
                  rate,          // rate of commission
                  commission,   // amount of commission
                  advance,     // advanced pay
                  pay,			  // amount to pay
						      base;			 // base pay        
	
  private String name;		// employee's Name

  /*
  following constructor uses 2 parameters to accept
  arguments: s and a
    -value in s is assigned to sales field
    -value in a is assigned to advance field
  calculatePay method is called
  */

  public SalesCommission(String n, double b, double s) {
      
      name = n;
		  base = b;
		  sales = s;
      calculatePay();

  }

   /*
   setRate method sets rate of comission,
   based on amount of sales;
   method called from calculatePay method
   */
   
   private void setRate() {

      if (sales < 10000)
         rate = 0.05;
      else if (sales < 15000)
         rate = 0.1;
      else if (sales < 18000)
         rate = 0.12;
      else if (sales < 22000)
         rate = 0.14;
      else
         rate = 0.16;
   
   }

   /*
   calculatePay method calculates the salesperson's
   commission and amount of actual pay.
   */

   private void calculatePay() {
      
      setRate();
      commission = sales * rate;
      pay = base + commission;
   
   }

   //getPay method returns pay field

   public double getPay() {
      
      return pay;
   
   }

   //getCommission method returns commission field

   public double getCommission() {
      
      return commission;
   
   }

   //getRate method returns rate field

   public double getRate() {
      
      return rate;
   
   }

   //getAdvance method returns advance field

   public double getBase() {
      
      return base;
   
   }

   //getSales method returns the sales field 

   public double getSales() {

      return sales;
   
   }

   //get Name method returns name field

   public String getName() {

      return name;

    }

}
