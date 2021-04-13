package methods;

import java.util.Scanner;

/*
Define a method that returns the product of two numbers
 entered by user.
*/
public class Q2 {
    public static void Product(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x=s.nextInt();
        System.out.println("Enter second number: ");
        int y=s.nextInt();
        int product = x*y;
        System.out.println("Product is: "+product);
    }
    public static void main(String[] args){
        Product();
    }
}
