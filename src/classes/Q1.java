package classes;
/*
Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

 */
public class Q1 {
    public static void main(String[] args){
        Student student = new Student();
        student.name = "John";
        student.roll_no = 2;
        System.out.println("Studend Name: "+student.name);
        System.out.println("Student roll_no: "+student.roll_no);

    }

}
class Student{
   String name;
   int roll_no;
}
