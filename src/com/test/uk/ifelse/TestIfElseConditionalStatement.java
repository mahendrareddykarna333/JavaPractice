package com.test.uk.ifelse;

public class TestIfElseConditionalStatement {

    public static void printLarge(int num1, int num2) {
        if (num1 < num2) {
            System.out.println(String.format(" %d < %d", num1, num2));
        } else {
            System.out.println(String.format(" %d > %d", num1, num2));
        }
    }

    public static void main(String [] args) {
        printLarge(100, 200);
        printLarge(300, 200);
    }
}
