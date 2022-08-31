package assignment.learning;

import java.util.Scanner;

public class no_is_even_or_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int no = input.nextInt();
        if(no%2 ==0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");

    }
}
