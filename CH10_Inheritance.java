/*
This: 'this' keyword is used to refer to the current class.
Super: 'super' keyword is used to refer to the parent class.
Method Overriding: Overriding the method defined in base class in derived class.
Dynamic Method Dispatch: Used to achieve runtime polymorphism.
*/
class Base{
    int x;
    public Base(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void sayHello(){
        System.out.println("Hello from Base Class");
    }

    public void hii(){
        System.out.println("Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

}

class Derived extends Base{
    int y;
    public Derived(int x, int y) {
        super(x);       // Refers to the Parent Class.
        this.y = y;     // refers to the Same Class.
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    @Override       // Overriding the method sayHello defined in Base Class.
    public void sayHello() {
        System.out.println("Hello from Derived Class");
    }

    public void Hehe(){
        System.out.println("Hehe");
    }
}
public class CH10_Inheritance {
    public static void main(String[] args) {
        // An Object of class 'Derived' can use the properties and methods of class 'Base'
        Derived d = new Derived(45, 66);
        System.out.println("Value of X is: " + d.getX());
        System.out.println("Value of Y is: " + d.getY());

        // Dynamic Method Dispatch
        Base b1 = new Derived(55, 89);
        b1.hii();           // Allowed
        b1.sayHello();      // Allowed
        // b1.Hehe();       // Not Allowed


    }
}
