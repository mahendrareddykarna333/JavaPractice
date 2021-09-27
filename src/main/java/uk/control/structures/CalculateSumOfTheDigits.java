package uk.control.structures;

public class CalculateSumOfTheDigits {

    //123   1+2+3 = 6
    /*123    % 10  =  3 ,   - remainder
             123/10 = 12 ,
             sum =3

                12 %10 =  2 ,
                12/10 = 1 ,

              sum = 3+ 2

                1%10 = 1 ,
                1/10 = 0
              sum = 3 + 2 + 1
     */

    public static int calculateSum(int number) {
        {

            int total = 0;

            for (; number > 0; ) {

                int remainder = number % 10;
                total = total + remainder;
                number = number / 10;

                System.out.println("Remainder  = " + remainder + " , total = " + total + " number = " + number);

            }
            System.out.println("Sum of the digits " + total);
            return total;
        }
    }

    public static void main(String args[]) {
        calculateSum(456);
    }

    }



