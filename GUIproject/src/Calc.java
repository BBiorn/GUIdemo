
public class Calc 
{
   private double num1, num2;
  
   public Calc(int number1, int number2)
   {
	   num1 = number1;
	   num2 = number2;
   }
   
   public String sum()//returns a string with the sum of num 1 and num 2
   {
	   return ("The sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));
   }
   
   public String diff()//returns a string with the difference of num 1 and num 2
   {
	   return (num1 + " subtracted from " + num2 + " is: " + (num2 - num1));
   }
   
   public String mult()//returns a string with the result of num 1 multiplied by num 2
   {
	   return("The multiplication of " + num1 + " and " + num2 + " is: " + (num1 * num2));
   }
   
   public String div()//returns a string with the result of num 1 divided by num 2
   {
	   if(num2 != 0)return("The division of " + num1 + " over " + num2 + " is: " + (num1 / num2));
	   else return("The division of " + num1 + " over " + num2 + " cannot be computed because of divide by zero error.");
   }
}
