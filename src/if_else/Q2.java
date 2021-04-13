package if_else;

import java.util.Scanner;

/*Question2
take two int values from user and print greatest among them
*/
public class Q2 {
    /*
    public static void main(String[] args){
        int x= 2;
        int y = 5;
        if(x>y){
            System.out.println("X is grater");
        }else{
            System.out.println("Y is greater");
        }
    }

 */

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of x ");
        int x=s.nextInt();
        System.out.println("Enter value of y ");
        int y=s.nextInt();
        if(x>y){
            System.out.println("X is greater");
        }else{
            System.out.println("Y is greater");
        }
    }
}
