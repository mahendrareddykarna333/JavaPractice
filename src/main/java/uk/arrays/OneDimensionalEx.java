package uk.arrays;

public class OneDimensionalEx {

    public static void main(String[] args) {

        int[] array = {10, 5, 2, 4, 444, 10, -23};
        printNumbers(array);
        printSmallest(array);




    }


    public static void printNumbers(int[] array) {
        if (array != null && array.length > 0) {
            for (int value : array) {
                System.out.print(" " + value);
            }

            for (int index = 0; index < array.length; index++) {
                System.out.print(" " + array[index]);
            }
        }
    }

    public static void printSmallest(int[] array) {
        if (array != null && array.length > 0) {
            int smallest = array[0];
            for (int index = 1; index < array.length; index++) {
                if (array[index] < smallest) {
                    smallest = array[index];
                }
            }
            System.out.println("Smallest = " + smallest);
        } else {
            System.out.println("Array is Empty or Null");
        }
    }
}
