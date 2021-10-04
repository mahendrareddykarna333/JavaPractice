package uk.arrays;


import java.util.Arrays;

//Linear Search
public class FindANumberInAnArray {

    public static void main(String args[]) {

        int array [] = { 10,20,30,40,60};
        System.out.println(findPosition(array,99));
        System.out.println(findPosition(array,20));


    }



    // return index if found , if not return -1
    public static int findPosition(int [] array, int elementToBeFound) {
        if(array!=null && array.length>0) {
            for(int index=0;index<array.length;index++) {
                if(array[index] == elementToBeFound) {
                    return index;
                }
            }
        }
        return -1;
    }
}
