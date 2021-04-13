package methods;

import java.util.Scanner;

/*
A person is elligible to vote if his/her age is
greater than or equal to 18. Define a
method to find out if he/she is elligible to vote.
 */
public class Q6 {
    public static void Vote(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter age of a person: ");
        int age = s.nextInt();
        if(age>=18){
            System.out.println("Elligible to vote");
        }else{
            System.out.println("You are under 18");
        }

    }
    public static void main(String[] args){
        Vote();
    }
}

