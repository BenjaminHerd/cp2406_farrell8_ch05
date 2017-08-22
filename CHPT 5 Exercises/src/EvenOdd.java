//import statement for java dialog box
import javax.swing.*;

//Class declaration
public class EvenOdd {
    public static void main(String[] args) {

        //Declare variables
        int num;
        String str;
        String output;

        //Assign a variable to an option window that accepts input, then parsed as an integer
        str = JOptionPane.showInputDialog(null, "Please enter a number: ");
        num = Integer.parseInt(str);

        //If the number has any remainders (% = Modulus) it is odd, otherwise it is even
        if (num % 2 == 0)
            output = "This is an even number";
        else
            output = "This is an odd number";

        //Message dialog box showing message that was tied to a string (output)
        JOptionPane.showMessageDialog(null, output);




    }
}
