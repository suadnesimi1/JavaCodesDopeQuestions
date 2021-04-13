package methods;

import java.util.Scanner;

/*
Define two methods to print the maximum
 and the minimum number respectively
 among three numbers entered by user.
 */
public class Q4 {
    public static void main(String[] args) {
        Max();
        Min();
    }
    public static void Max(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1=s.nextInt();
        System.out.println("Enter num2: ");
        int num2=s.nextInt();
        System.out.println("Max num: "+Math.max(num1,num2));

    }
    public static void Min(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = s.nextInt();
        System.out.println("Enter num2 ");
        int num2 = s.nextInt();
        System.out.println("Min num: "+Math.min(num1,num2));
    }
}
