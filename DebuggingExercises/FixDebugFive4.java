// DebugFive4.java
// Outputs highest of four numbers

//import statement for dialog box
import javax.swing.*;
public class FixDebugFive4
{
   public static void main (String args[]) 
   {
       //declare variables in one line
      int one, two, three, four;
      String str, output;

      //Takes each number in a dialog box and converts to an integer from a string
      str = JOptionPane.showInputDialog(null,"Enter an integer");
      one = Integer.parseInt(str);
      str = JOptionPane.showInputDialog(null,"Enter an integer");
      two = Integer.parseInt(str);
      str = JOptionPane.showInputDialog(null,"Enter an integer");
      three = Integer.parseInt(str);
      str = JOptionPane.showInputDialog(null,"Enter an integer");
      four = Integer.parseInt(str);

      //if the first number is greater than the second & one > three & one > four = one is the highest
      //  && = AND
       if(one > two && one > three && one > four)
         output = "Highest is " + one;
      else
         if(two > one && two > three && two > four)
            output = "Highest is " + two;
         else
           if(three > one && three > two && three > four)
              output = "Highest is " + three;
           else
              output = "Highest is " + four;
           //prints output string in a dialog box with result
      JOptionPane.showMessageDialog(null, output);
   }
}


