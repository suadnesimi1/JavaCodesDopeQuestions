package if_else;

import java.util.Scanner;

/*Question3
A shop will give discount of 10% if the cost of purchased quantity is
more than 1000. ask user for quantity
suppose, one unit will cost 100
judge and print total cost for user
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter quantity");
        int x = s.nextInt();
        if ((x * 100) > 1000) {
            System.out.println("You get a discount of " + (.1 * x * 100) + " and your total cost is " + (x * 100 - (.1 * x * 100)));
        } else {
            System.out.println("No discount");
        }
    }

}

