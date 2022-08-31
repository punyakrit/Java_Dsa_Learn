package assignment.learning;

import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // int n = input.nextInt();
        for(int i =100; i <1000; i++){
            if(Armstrong(i)){
                System.out.print(i + " ");
            }
        }

    }

    static Boolean Armstrong(int n){
        int original = n;
        int sum = 0;
        while (n>0){
            int temp=n%10;
            n = n/10;
            sum = sum+ temp*temp*temp;
        }
        return original == sum;



    }
}
