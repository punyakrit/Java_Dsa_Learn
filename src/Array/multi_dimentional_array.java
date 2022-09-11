package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class multi_dimentional_array {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
         */
        //int []  means 1 d array
        //int[][] means 2 d array
        //int[][] = new int[1][] adding rows value is important


//        int[][] arr= new int[3][3];

        int[][] arr = {
                {1 ,2 ,3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(arr));

    }
}
