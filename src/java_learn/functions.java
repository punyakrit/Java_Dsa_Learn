package java_learn;

import java.util.Scanner;

//public class functions {
//
//
//    public static void main(String[] args) {
//
//
//
//        int ans =sum();
//        System.out.println(ans);
//    }
//
//
//            //returning the value in int
//
//    static int sum(){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter no 1 : ");
//        int num1 = input.nextInt();
//        System.out.print("Enter no 1 : ");
//        int num2 = input.nextInt();
//        int sum = num1+num2;
//        return sum;
//    }
//
//}




//                returning string
//public class functions {
//    public static void main(String[] args) {
//
//        String message  = greet();
//        System.out.println(message);
//
//    }
//    static String greet(){
//        String greeting = "how are you";
//        return greeting;
//    }
//}
//




//pass the value of numbers when calling in main
//public class functions{
//    public static void main(String[] args) {
//        int ans = sum(20 ,30);
//        System.out.println(ans);
//    }
//    static int sum(int a, int b){
//        int sum = a+b;
//        return sum;
//    }
//}



// string input into function
//public class functions{
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = input.next();
//        String message = greet(name);
//        System.out.println(message);
//    }
//
//    static String greet(String name) {
//        String message = "hello " + name;
//        return message;
//    }
//}



//            shadowing
//public class functions{
//    int x = 100;
//    public static void main(String[] args) {
//        System.out.println(x);
//        int x;
//        x = 50;
//        System.out.println(x);
//        fun();
//    }
//
//    static void fun() {
//        System.out.println(x);
//    }
//}