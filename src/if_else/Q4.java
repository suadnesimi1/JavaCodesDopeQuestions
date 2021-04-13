package if_else;


import java.util.Scanner;

/*Question 4
A compnay decided to give bonus of 5% to employee if his/her
year of service is more than 5 years.
ask user for their salary and year of service and print the net bonus amount
 */
public class Q4 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter salary in euro ");
        int x=s.nextInt();
        System.out.println("Enter year of service");
        int y = s.nextInt();
        if(y>=5){
            System.out.println("you get bonus of "+(5*x/100)+ " euro and your total salary is "
            +(x+(.5*x/100)));
        }else{
            System.out.println("You dont have 5 or more expercience");
        }
    }
}
