package for_loop;

import java.util.Scanner;

/*
Write a program to find greatest common divisor (GCD) or
highest common factor (HCF) of given two numbers
 */
public class Q6 {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        int gcd = 1;
        for(int i =1;i<num1 && i<=num2;i++){
            if(num1%i==0 && num2%i == 0)
                gcd = i;
     }
        System.out.printf("GDC of %d and %d is: %d ",num1,num2,gcd);
    }
}
