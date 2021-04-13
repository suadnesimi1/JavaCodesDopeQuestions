package methods;

import java.util.Scanner;

/*
Define a program to find out whether a given
number is even or odd.

 */
public class Q5 {
    public static void main(String[] args) {
        EvenOdd();
    }
    public static void EvenOdd(){
        int num;
        System.out.println("Enter a number ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        if(num % 2 == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
