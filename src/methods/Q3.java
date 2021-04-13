package methods;

import java.nio.channels.Pipe;
import java.util.Scanner;
import java.lang.Math;

/*
Write a program to print the circumference
 and area of a circle of radius entered
 by user by defining your own method.
 */
public class Q3 {
public static void CircumferenceandArea(){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter radius: ");
    int r=s.nextInt();
    double circumference = 2*Math.PI*r;
    double area = Math.PI*r*r;
    System.out.println("Circumference: "+circumference);
    System.out.println("Area: "+area);
}
public static void main(String[] args){
    CircumferenceandArea();
}
}
