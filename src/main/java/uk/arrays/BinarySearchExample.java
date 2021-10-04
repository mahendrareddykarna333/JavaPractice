package uk.arrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String args[]) {
        int array [] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 200, 300, 400, 500, 600, 700};
        char charArray [] = {'a','c','e','f','h','r','z'};
        System.out.println(Arrays.binarySearch(array,700));
        System.out.println(Arrays.binarySearch(charArray,'x'));

    }
}
