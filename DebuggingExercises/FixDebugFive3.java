// DebugFive3.java
// Determines whether item number on order is valid
// Over 999 invalid
// Less than 111 Invalid
// Valid and less than 500 - Automotive Department
// Valid and 500 or higher Housewares Department
import java.util.Scanner;
public class FixDebugFive3
{
   public static void main (String args[])
   {
       //variable declaration
      int item;
      String output;
      final int LOW = 111;
      final int HIGH = 999;
      final int CUTOFF = 500;

      //Get input from keyboard
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter item number");

      //take input as an integer
      item = input.nextInt();

      //Decisions:

       //If item is less than 111, then print low message
      if(item < LOW)
         output = "Item number too low";

      //If item is greater than 999, too high, print high message
      else
        if(item > HIGH)
          output = "Item number too high";
      //If it's lower than 500, print automotive message
      else
          if(item < CUTOFF)
             output = "Valid - in Automotive Department";
      //If it's higher than 500, print house message
          else
             output = "Valid - Item in Housewares Department";

          //This takes what case is relevant and prints assigned message
       System.out.println(output);
   }
}


