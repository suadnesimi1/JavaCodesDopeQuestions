package subclass;
/*
Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.
 */
class Q3 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();
        employee.name = "employee";
        employee.age = 23;
        employee.address = "tetovo";
        employee.pnumber = 322342;
        employee.salary = 100;
        employee.specialization = "1121";
        manager.name = "manager";
        manager.age = 32;
        manager.address = "taiaush12";
        manager.pnumber = 1212;
        manager.salary = 234;
        manager.department = "dsa";
        System.out.println("This is employee\t \n "+employee.name+"\n"+employee.address+"\n"+employee.age+"\n"+employee.pnumber+"\n"+employee.salary);
        System.out.println("This is manager \t \n"+manager.name+"\n"+manager.age+"\n"+manager.address+"\n"+manager.pnumber+"\n"+manager.salary);
    }
}
class Member{
        String name;
        int age;
        int pnumber;
        String address;
        double salary;
        public void printSalary(){
            System.out.println(salary);
        }
    }
class  Employee extends Member{
        String specialization;


    }
class Manager extends Member{
        String department;
    }

