package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(67);
//        list.add(3);
//        list.add(7);
//        list.add(4);
//        list.add(9);

//        System.out.println(list.contains(3));
//        System.out.println(list);
//
//        list.set(0 , 99);
//        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());

        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(in.nextInt()));

        }
    }
}
