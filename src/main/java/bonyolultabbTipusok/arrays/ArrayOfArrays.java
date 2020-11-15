package bonyolultabbTipusok.arrays;

public class ArrayOfArrays {
    public static void main(String[] args) {
        int[][] a = new int[3][]; // belső tömbök mérete nem egyezik meg egymással
        a[0] = new int[1];
        a[1] = new int[2];
        a[2]= new int[3];

        a[0][0]=8;

        int[][] b = {{1},{1,2},{1,2,3}};




    }


}
