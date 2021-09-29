package uk.control.structures;

public class LargestNumber {

    public static void main(String args[]) {
        int a = 4;
        int b = 2;
        int c = 3;
        int d = 1;


        if (a >= b && a >= c && a >= d)
            System.out.println(a + " is the largest Number");


        else if (b >= a && b >= c && b >= d)
            System.out.println(b + " is the largest Number");

        else if (b >= a && b >= c && b >= d)
            System.out.println(b + " is the largest Number");


    }

    public static int getLargeInFour1(int a, int b, int c, int d) {
        int large = a;
        if (b > large) large = b;
        if (c > large) large = c;
        if (d > large) large = d;
        return large;
    }

    public static int getLargeInFour(int a, int b, int c, int d) {
        return getLarge(getLarge(a, b), getLarge(c, d));
    }


    public static int getLarge(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}

