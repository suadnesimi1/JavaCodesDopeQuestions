package classes;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Add two distances in inch-feet by creating a class named 'AddDistance'.
 */
public class Q11 {
    public static void main(String[] args)  {
        /*
        Scanner s = new Scanner(System.in);
        System.out.println("Enter distance in feet");
        double feet = s.nextInt();
        System.out.println("Enter distance in inch");
        double inch = s.nextInt();

         */
        AddDistance addDistance = new AddDistance();
        addDistance.feet = 14.5;
        addDistance.inch = 12.3;
        System.out.println("Distance in feet: "+addDistance.feet+"\nDistance in inch: "+addDistance.inch);
    }
}
class AddDistance{
    double inch;
    double feet;
}
