package if_else;
import java.util.Scanner;

/*question1
take values of length and breadth of a rectangle from
user and check if it is square or not.
 */

public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length ");
        int x=sc.nextInt();
        System.out.println("Enter breadth ");
        int y = sc.nextInt();
        if(x==y){
            System.out.println("It is square");
        }else{
            System.out.println("It  is not");
        }

    }
}
