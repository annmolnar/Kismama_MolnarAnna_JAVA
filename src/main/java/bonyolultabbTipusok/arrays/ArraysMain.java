package bonyolultabbTipusok.arrays;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        String[] daysOfTheWeek = {"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println(daysOfTheWeek.length);

        int[] multipleTwo = {1,2,4,8,16};
        for( int m: multipleTwo){
            System.out.println(m);;
        }

        boolean[] b = {false, true, true, true, false, false};
        for(boolean bs:b){
            System.out.println(bs);
        }

        ArrayHandler arrayPractice = new ArrayHandler();
        System.out.println(arrayPractice.contains(new int[]{1, 5, 4, 8},3));
        System.out.println(arrayPractice.find(new int[]{1,3,4,7,9,8,66, 5, 4, 8},5));

        ArrayOfArraysMain arrayPractice2 = new ArrayOfArraysMain();
        int [][] array = arrayPractice2.triangularMatrix(4);
        for (int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){

            }

        }
        //System.out.println(arrayPractice2.multiplicationTable(2));
        //System.out.println(arrayPractice2.multiplicationTable(4));
       System.out.println(Arrays.deepToString(arrayPractice2.multiplicationTable(5)));
       System.out.println(Arrays.deepToString(arrayPractice2.triangularMatrix(5)));
       System.out.println(Arrays.deepToString(arrayPractice2.printArrayOfArrays(new int[5][3])));
       //System.out.println(Arrays.deepToString(arrayPractice2.getValues()));
        arrayPractice2.getValues();


    }
}
