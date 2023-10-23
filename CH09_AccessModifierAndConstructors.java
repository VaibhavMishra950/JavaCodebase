/*
Access Modifiers: Used to define the accessibility of any property or method.
Constructor: A block of code which runs automatically when the Object of that class is created.
    Types:
        1. Default Constructor: The constructor which doesn't have any parameters.
        2. Parameterized Constructor: The constructor which has parameters.
 */
class Employee2{
    private int id;
    private String name;

    // Setters
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }

    // Getters
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
}

class Programmer{
    int id;
    String name;
    String language;

    public Programmer(){    // Default Constructor
        System.out.println("This is default Constructor");
    }

    public Programmer(int id, String name, String language){    // Parameterized Constructor
        this.id = id;
        this.name = name;
        this.language = language;
    }


}

public class CH09_AccessModifierAndConstructors {
    public static void main(String[] args) {
        Employee2 e1 = new Employee2();

        // e1.id = 1101;
        // e1.name = "John Doe";  // Won't work as name & id are private.

        e1.setId(1101);
        e1.setName("John Doe");

        System.out.println("Hello " + e1.getName() + ", Your id is: " + e1.getId());

        Programmer p1 = new Programmer(102, "Micheal Jordan", "Java");
        System.out.println("Hello " + p1.name + ", Your id is: " + p1.id + " and your favourite" +
                " language is: " + p1.language);

    }
}
