package Array;

import java.util.Arrays;

public class passing_in_functions {
    public static void main(String[] args) {
        int[] num = {0,1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}

//output
//[0,1,2,3,4,5,6,7]
//[99,1,2,3,4,5,6,7]