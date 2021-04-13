package classes;

/*
Write a program to print the area and perimeter
of a triangle having sides of 3, 4 and 5 units by
creating a class named
'Triangle' without any parameter in its constructor.
 */
public class Q3 {
    public static void main(String[] args){
        Triangle triangle = new Triangle();
        triangle.x=3;
        triangle.y=4;
        triangle.z=5;
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());

    }
}
class Triangle{
    int x,y,z;
    public double getArea(){
        double s=(x+y+z)/2.0;
        return Math.pow((s*(s-x)*(s-y)*(s-z)),.5);
    }
    public  double getPerimeter(){
        return (x+y+z)/2.0;
    }
}