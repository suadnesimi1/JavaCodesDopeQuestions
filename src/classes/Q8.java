package classes;

import java.util.Scanner;

/*
Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.
 */
public class Q8 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter num1: ");
        double num1 = s.nextInt();
        System.out.println("Enter num2: ");
        double num2= s.nextInt();
        System.out.println("Enter num3: ");
        double num3=s.nextInt();
        Average average = new Average();
        System.out.println("Sum "+average.sum);
        System.out.println("average " +average.average);



    }
}
class Average{
    double num1;
    double num2;
    double num3;
    double sum;
    double average;
    public double Calculate(){
        sum = num1+num2+num3;
        average = sum/3;
       return average;

    }
}
