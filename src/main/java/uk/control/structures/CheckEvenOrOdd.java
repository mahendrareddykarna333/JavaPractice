package uk.control.structures;

public class CheckEvenOrOdd {

    public static boolean isEven(int n) {
        int remainder = n % 2;

        if(remainder ==0) {
            return true;
        }  else {
            return false;
        }
    }

}
