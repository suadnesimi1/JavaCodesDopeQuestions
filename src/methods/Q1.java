package methods;

import java.util.Scanner;

/*
Write a program to print the sum of two numbers entered
by user by defining your own method.
 */
public class Q1 {
    public static void Sum(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x=s.nextInt();
        System.out.println("Enter second number: ");
        int y=s.nextInt();
        int sum = x+y;
        System.out.println("Sum is: "+sum);

    }
    public static void main(String[] args){
        Sum();
    }
}
