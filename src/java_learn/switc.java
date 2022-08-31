package java_learn;

import java.util.Scanner;

public class switc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        switch (fruit) {
            case "Mango" -> System.out.println("Mango");
            case "Mang" -> System.out.println("Mangfd");
            default -> System.out.println("ok");
        }
    }
}


