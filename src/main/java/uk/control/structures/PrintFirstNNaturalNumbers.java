package uk.control.structures;

public class PrintFirstNNaturalNumbers {

    public static void main(String args[]) {
        printNumbers(100);
    }

    public static void printNumbers(int n) {
        for(int index=1;index<=n;index++) {
            System.out.print(" "+index);
        }

    }
}
