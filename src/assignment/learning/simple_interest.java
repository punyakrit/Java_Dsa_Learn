package assignment.learning;

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter time : ");
        int t = input.nextInt();
        System.out.print("Enter principal : ");
        double p = input.nextDouble();
        System.out.print("Enter rate : ");
        double r = input.nextDouble();

        double si = (p*r*t)/100;
        System.out.println(si);

    }
}
