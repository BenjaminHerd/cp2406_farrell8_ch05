// DebugFive1
// Adds your lunch bill
// Burger and hot dog are $2.59
// Grilled cheese and fish are $1.99
// Fries are 89 cents

//import statements to make the option box appear
import javax.swing.*;
public class FixDebugFive1
{
   public static void main(String args[]) throws Exception
   {
      //Variable declaration

      //HIGH_PRICE includes both burger and hot dog
      final double HIGH_PRICE = 2.59;
      final double MED_PRICE = 1.99;
      final double LOW_PRICE = 0.89;
      String usersChoiceString;
      int usersChoice;
      double bill = 0.0;

      //Brings up dialog box to take user input and display message
      usersChoiceString = JOptionPane.showInputDialog(null,
         "Order please\n1 - Burger\n2 - Hotdog" +
         "\n3 - Grilled cheese\n4 - Fish sandwich");

      //accepts a string and changes the usersChoice from a string >> integer
      usersChoice= Integer.parseInt(usersChoiceString);
      if(usersChoice == 1 || usersChoice == 2)
         bill = bill + HIGH_PRICE;
      else
         bill = bill + MED_PRICE;
      usersChoiceString = JOptionPane.showInputDialog(null,
          "Fries with that?\n1 - Yes\n2 - No");
      usersChoice = Integer.parseInt(usersChoiceString);
      if (usersChoice == 1)
          bill = bill + LOW_PRICE;

      JOptionPane.showMessageDialog(null,"Bill is " + bill);
   }
}
