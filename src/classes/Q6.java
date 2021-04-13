package classes;

import java.util.Scanner;

/*
Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
 */
public class Q6 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = s.nextInt();
        System.out.println("Enter breadth ");
        int breadth = s.nextInt();
        System.out.println("Area is: "+length * +breadth);

    }
}
class Area{
    int length;
    int breadth;
    public void setDim(int l, int b) {
        length = l;
        breadth = b;
    }
        public int getArea(){
            return length*breadth;
        }


}
