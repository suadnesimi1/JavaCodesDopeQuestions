package classes;
/*
Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat
 */

public class Q10 {
    public static void main(String[] args){
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        employee1.Name="Robert";
        employee2.Name="Sam";
        employee3.Name="John";
        employee1.Year_of_joining="1994";
        employee2.Year_of_joining="2000";
        employee3.Year_of_joining="1999";
        employee1.Address="64C- WallsStreat";
        employee2.Address="68D- WallsStreat";
        employee3.Address="26B- WallsStreat";
        System.out.println("\tName\n"+employee1.Name+ "\n"+employee2.Name+ "\n"+employee3.Name);
        System.out.println("\tYear of Joining\n"+employee1.Year_of_joining+ "\n"+employee2.Year_of_joining+ "\n"+employee3.Year_of_joining);
        System.out.println("\tAddress\n"+employee1.Address+"\n"+employee2.Address+"\n"+employee3.Address);

    }
}
class Employee{
    public String Name;
    public double Salary;
    public String Year_of_joining;
    public String Address;
    public Employee(){

    }
    public Employee(String name,double salary,String year_of_joining,String address){
        this.Name=name;
        this.Salary=salary;
        this.Year_of_joining=year_of_joining;
        this.Address=address;
    }
}

