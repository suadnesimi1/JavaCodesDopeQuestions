package classes;

import java.util.Scanner;

/*Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.

 */
public class Q7 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Length ");
        int l = s.nextInt();
        System.out.println("Enter Breadth");
        int b = s.nextInt();
        Area1 area1 = new Area1(l,b);
        System.out.println("Area is: "+area1.returnArea1());

    }
}
class Area1{
    int length;
    int breadth;
    public Area1(int l, int b){
        length=l;
        breadth=b;
    }
    public int returnArea1(){
        return  length * breadth;
    }
}
