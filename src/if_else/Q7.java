package if_else;

import java.util.Scanner;

/*Question 7
write a program to print absolute value of a number enteres by user

*/
public class Q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number ");
        int x = s.nextInt();
        if (x < 0) {
            System.out.println(Math.abs(x));
        } else {
            System.out.println(x);
        }
    }
}