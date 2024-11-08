package miscellaneousPackage;

import com.google.common.hash.HashingOutputStream;

public class ifStructureOrIfStatements {

    public static void main (String[] args) {

        int x = 40;

        String name = "Ahmad";

        double number = 123.5;

        if (x % 2 ==0) {
            System.out.println("Even");

        } else {
            System.out.println("Odd");
        }

        if (name .equals("Ahmad")) {
            System.out.println(" please print the name in the consle");
        }  else {
            System.out.println("the entered name is wrong and invalid!");
        }

        if (number == 125) {

            System.out.println(" Entered number is not meet to the right number!");

        } else System.out.println("The entered number is correct and print it in the console!");

        //--------------------------------------------------------------------

        int xTwo = 0;

        if (xTwo == 0) {
            System.out.println("Zero");

        } else if ( xTwo % 2 == 0 ) {
            System.out.println(" Odd");


        } else System.out.println("Odd");



        int xX = 45;

        if (xX == 0) {

            System.out.println("Zero");

        } else if (xX % 2 == 0) {

            System.out.println("Even");

        } else System.out.println("Odd");


        short y = 4;

        if ( y == 0) {

            System.out.println("Zero");

        } else if (y % 2 == 0) {
            System.out.println("Even");

        } else System.out.println("Odd");


        int z = 0;

        if ( z > 0 ) System.out.println("Positive");
        else if ( z < 0 ) System.out.println("Nagetive");
        else System.out.println("Zero");


        /// ************************ Nested if / Nested Condition!***********************\\

      int f = 3;

      if ( f % 2 == 00 ) {
          if (f != 0) {
              System.out.println("Even");
          } else {
              System.out.println("Zero");
          }
      } else System.out.println("Odd");




    }
}
