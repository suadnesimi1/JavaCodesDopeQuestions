package methods;

import java.util.Scanner;

/*
Define a method to find out if number is prime or not
 */
public class Q7 {
    public static void Prime(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 =s.nextInt();
        if(num1%2==0){
            System.out.println(+num1+"  is not prime");
        }else{
            System.out.println(+num1+" is prime");
        }
    }
    public static void main(String[] args){
        Prime();
    }
}
