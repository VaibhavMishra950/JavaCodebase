/*
Abstract Class: A class containing an Abstract Method. We can't create an Object of such classes.
Abstract Method: A method which is only declared but not defined. It is supposed to be defined in
                 Derived Class
Interface: Group of related methods with empty bodies.
 */

abstract class Parent{
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void sayHii();
}

class Child extends Parent{
    public void sayHii(){
        System.out.println("Hiiii");
    }
}

interface Bicycle{
    int x = 55; // These can be accessed but cannot be modified
    void speedUp(int inc);
    void speedDown(int dec);
}
interface Horn{
    void hornOne();
    void hornTwo();
}
class HeroCycle implements Bicycle, Horn{
    int speed = 10;
    public void speedUp(int inc){
        speed += inc;
    }
    public void speedDown(int dec){
        speed -= dec;
    }

    public void hornOne() {
        System.out.println("Horn Oneeeeeeeeeeeeee");
    }
    public void hornTwo() {
        System.out.println("Horn Twooooooooooooo");
    }
}


public class CH11_AbstractClassAndInterfaces {
    public static void main(String[] args) {

        // Parent p1 = new Parent(); // Error
        Child c1 = new Child();
        c1.sayHello();
        c1.sayHii();

        HeroCycle h1 = new HeroCycle();
        System.out.println("Current Speed: " + h1.speed);
        h1.speedUp(5);
        System.out.println("Current Speed: " + h1.speed);
        h1.speedDown(8);
        System.out.println("Current Speed: " + h1.speed);
    }
}
