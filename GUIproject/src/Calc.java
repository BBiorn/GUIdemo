
public class Calc 
{
   private double num1, num2;
  
   public Calc(int number1, int number2)
   {
	   num1 = number1;
	   num2 = number2;
   }
   
   public String sum()
   {
	   return ("The sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));
   }
   
   public String diff()
   {
	   return (num1 + " subtracted from " + num2 + " is: " + (num2 - num1));
   }
   
   public String mult()
   {
	   return("The multiplication of " + num1 + " and " + num2 + " is: " + (num1 * num2));
   }
   
   public String div()
   {
	   if(num2 != 0)return("The division of " + num1 + " over " + num2 + " is: " + (num1 / num2));
	   else return("The division of " + num1 + " over " + num2 + " cannot be computed because of divide by zero error.");
   }
}
