package for_loop;

import java.util.Scanner;

/*Question 1
Take 10 integers from keyboard using loop
and print their sum value on the screen
 */
public class Q1 {
    public static void main(String[] args) throws ArithmeticException {
        Scanner s = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number ");
            sum = sum + s.nextInt(); // nextinit is used to input an integer value from the user and assign it to the variable n.

        }

        System.out.println("Sum is " + sum);

    }
}
