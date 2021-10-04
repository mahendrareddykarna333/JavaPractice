package uk.arrays;

public class TwoDimensionalExample {

    public static void main(String args[]) {

        int a1 [] = {1,2,3,4};
        int a2 [] = {5,6,7,8};
        int a3 [] = {1,1,1,1};

        int array[][] = {
                a1,a2,a3
        };

        int array1[][] = {
                {1,2,3,4,0,0230,},
                {5,6,7},
                {1,1,1,1}
        };

        for(int i=0;i< array1.length;i++) {
            for(int j=0;j<array1[i].length;j++) {
                System.out.print(" "+array1[i][j]);
            }
            System.out.println();
        }

    }
}
