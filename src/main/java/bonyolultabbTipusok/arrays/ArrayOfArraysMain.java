package bonyolultabbTipusok.arrays;

public class ArrayOfArraysMain {
     int[][] multiplicationTable(int size){
         int [][] mT = new int[size][size];
        for(int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                mT[i][j] = (i+1)*(j+1);
            }
        }
        return mT;
    }

    int[][] printArrayOfArrays(int[][] a){
        return a;
     }

    int[][] triangularMatrix(int size){
        int [][] matrix = new int[size][];
        for(int i=0;i<size;i++){
            matrix[i]=new int[i+1];
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]= i;
            }
        }
        return matrix;
    }

    int[][] getValues(){
         int monthInAYear=12;
         int [][] daysInMonths =new int[monthInAYear][];
        for(int i=0;i<monthInAYear;i++){
            if (i==1){
                daysInMonths[i] = new int[28];
            }
            else if(i%2==0 && i<7){
                daysInMonths[i] = new int[31];
            }
            else if(i>=7 && i%2!=0){
                daysInMonths[i] = new int[31];
            }
            else daysInMonths[i] = new int[30];
            for(int j=0;j<daysInMonths[i].length;j++){
                daysInMonths[i][j]=j+1;
                System.out.println(daysInMonths[i][j]);
            }
        }

         return daysInMonths;
    }

}
