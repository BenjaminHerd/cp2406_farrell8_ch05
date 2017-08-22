//import statement for java option panes
import javax.swing.*;

public class AscendingAndDescending {
    public static void main(String[] args) {

        //declaring multiple variables on the one line
        int numOne, numTwo, numThree;
        int low, med, high;
        String str;

        //Assign variable to java option window and parse input as an integer
        str = JOptionPane.showInputDialog(null, "Please enter the first number: ");
        numOne = Integer.parseInt(str);

        str = JOptionPane.showInputDialog(null, "Please enter the second number: ");
        numTwo = Integer.parseInt(str);

        str = JOptionPane.showInputDialog(null, "Please enter the third number: ");
        numThree = Integer.parseInt(str);


        //Assign integers to sorting variables to be printed later via if statements
        //Nest if statements covering each possible combination of number order (Maybe a list would be better?)
        if (numOne <= numTwo && numOne <= numThree) {

            low = numOne;
            if (numTwo <= numThree) {
                med = numTwo;
                high = numThree;
            }
            else
            {
                med = numThree;
                high = numTwo;
            }

        }
        else
        {
            if (numTwo <= numOne && numTwo <= numThree) {
                low = numTwo;
                if(numOne <= numThree){
                    med = numOne;
                    high = numThree;
                }
                else {
                    med = numThree;
                    high = numOne;
                }

            }
            else{
                low = numThree;
                if (numOne <= numTwo) {
                    med = numOne;
                    high = numTwo;
                }
                else
                {
                    med = numTwo;
                    high = numOne;

                }

            }


        }
        //Messages printing both ascending and descending order of numbers
        JOptionPane.showMessageDialog(null, "Ascending order: \n" + low + "\n" + med + "\n" + high);

        JOptionPane.showMessageDialog(null, "Descending order: \n" + high + "\n" + med + "\n" + low);


    }
}