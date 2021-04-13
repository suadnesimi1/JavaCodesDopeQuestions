package subclass;

public class Q1 {
    public static void main(String[] args) {
        ParentClass p = new ParentClass();
        ChildClass c = new ChildClass();
        p.parentMethod();
        c.childMethod();
        c.parentMethod();
    }
}
class ParentClass{
    public void parentMethod(){
        System.out.println("This is parent method");
    }

}
class ChildClass extends ParentClass{
    public void childMethod(){
        System.out.println("This is child method");

    }
}
