// DebugFive2.java
// Decides if two numbers are evenly divisible (Have no remainders)

//Takes input from command prompt characters entered from keyboard
import java.util.Scanner;
public class FixDebugFive2
{
   public static void main(String args[])
   {

      //variable declaration
      int num;
      int num2;

      //initialise scanner for user_input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number ");

      //Takes the input as an integer
      num = input.nextInt();
      System.out.print("Enter another number ");
      num2 = input.nextInt();

      //If the numbers are evenly divisible in both combinations, success message
      //  || = OR
      if((num % num2 == 0) || (num2 % num) == 0)
         System.out.println("One of these numbers is evenly divisible into the other");
      else
         System.out.println("Neither of these numbers is evenly divisible into the other");
   }

}