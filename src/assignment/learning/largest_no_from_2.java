package assignment.learning;

import java.util.Scanner;

public class largest_no_from_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num1 > num2){
            System.out.println("Num1 is greater");
        }
        else {
            System.out.println("Num2 is greater");
        }
    }
}
