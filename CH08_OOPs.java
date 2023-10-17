/*
Basic Concepts in Object-Oriented Programming:
    Classes - Basic template for creating objects.
    Objects – Basic run-time entities.
    Data Abstraction - Hiding Implementation Details.
    Encapsulation – Wrapping data and functions into a single unit.
    Polymorphism – Ability to take more than one forms.
    Inheritance – Properties of one class can be inherited into others.

 */

class Employee{
    int id;
    float salary;
    String name;

    void setDetails(int id, float sal, String name){
        this.id = id;
        salary = sal;
        this.name = name;
    }
    void getDetails(){
        System.out.println("ID: " + this.id);
        System.out.println("Salary: " + this.salary);
        System.out.println("Name: " + name);
    }
}

public class CH08_OOPs {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setDetails(101, 45000, "Rahul Kumar");
        e1.getDetails();
    }
}
