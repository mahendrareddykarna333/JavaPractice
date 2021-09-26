package uk.ifelse;

public class IfElseConditionalStatement {


    public static int getLargestInThreeNumbers(int n1, int n2, int n3) {
        int large = getLarge(n1, n2);
        return getLarge(large, n3);
    }

    public static int getLarge(int num1, int num2) {
        if (num1 < num2) {
            return num2;
        } else {
            return num1;
        }
    }
}
