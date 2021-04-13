package classes;
/*
Write a program to print the area of two
rectangles having sides (4,5) and (5,8)
respectively by creating a class named 'Rectangle'
with a method named 'Area' which returns the area and length
and breadth passed as parameters to its constructor.
 */
public class Q5 {
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(4,5);
        Rectangle rectangle2 = new Rectangle(5,8);
        System.out.println("Area of rec1 "+rectangle1.getArea()+" Paramter of rec1 "+rectangle1.getParamter());
        System.out.println("Area of rec2 "+rectangle2.getArea()+" Parameter of rec2 "+rectangle2.getParamter());


    }
}
class Rectangle{
    int length;
    int breadth;
    public Rectangle(int l, int b){
        length = l;
        breadth=b;
    }
    public int getArea(){
        return length*breadth;
    }
    public int getParamter(){
        return 2*(length*breadth);
    }

}