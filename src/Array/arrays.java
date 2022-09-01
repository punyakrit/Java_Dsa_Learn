package Array;

public class arrays {
    public static void main(String[] args) {
        //syntax
        //datatype[] variable name = new datatype [size]
        //store 5 roll numbers :
//        int[] rnos = new int[5];
//        //or directly can write
//        int[] rons2 = {1,2,3,4,5,6,7};

        int[] ros; //decleration of array is getting defined in the stack.
        ros = new int[5];//initialisation: here objects is being created in the heap.
        System.out.println(ros[3]);

        String[] arr = new String[5];
        System.out.println(arr[4]);
    }
}
