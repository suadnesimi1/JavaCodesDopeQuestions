package classes;
/*
Assign and print the roll number,
phone number and address of two students
having names "Sam" and "John" respectively
by creating two objects of class 'Student'.
 */
public class Q2 {
    public static void main(String[] args){
        Studenti student1 = new Studenti();
        Studenti student2 = new Studenti();
        student1.name="Sam";
        student2.name="John";
        student1.address="TE";
        student2.address="GV";
        student1.phoneno="098765";
        student2.phoneno="986543";
        System.out.println(student1.name);
        System.out.println(student1.address);
        System.out.println(student1.phoneno);
        System.out.println(student2.name);
        System.out.println(student2.address);
        System.out.println(student2.phoneno);
    }
}

class Studenti{
    String name;
    String phoneno;
    String address;

}
