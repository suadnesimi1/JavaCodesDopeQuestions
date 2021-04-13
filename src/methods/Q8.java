package methods;

import java.util.Scanner;

/*
Write a program which will ask the user to enter
his/her marks (out of 100).
Define a method that will display grades
according to the marks entered as below:
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail
 */
public class Q8 {
    public static void Grade(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int x=s.nextInt();
        if(x>91 && x<100){
            System.out.println(" AA ");
        }else if(x>81 && x<90){
            System.out.println("  BA ");
        }else if(x>71 && x<80){
            System.out.println("  BB ");
        }else if(x>61 && x<70){
            System.out.println(" BC ");
        }else if(x>51 && x<60){
            System.out.println(" CD ");
        }else if(x>41 && x<50){
            System.out.println(" DD ");
        }else if(x<=40){
            System.out.println(" F ");
        }else{
            System.out.println("Error input");
        }
    }
    public static void main(String[] args){
        Grade();
    }
}
