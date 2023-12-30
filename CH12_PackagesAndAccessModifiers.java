/*
package Learning;


Packages are used to group inter-related classes.
Compiling Packaged files:
      javac -d . CH12_PackagesAndAccessModifiers.java
         -d --> To tell java compiler to use packages
         .  --> Where to store the files (. means same directory)

Access Modifiers: Used to determine who can access any property or method of any class.
                  Can be public, protected, no modifier, or private.
Access Table:
     Modifier        | Class | Package | Sub-Class | World
    --------------------------------------------------------
     Public          |   Y   |    Y    |     Y     |   Y   |
     Protected       |   Y   |    Y    |     Y     |   N   |
     Default (None)  |   Y   |    Y    |     N     |   N   |
     Private         |   Y   |    N    |     N     |   N   |
 */

class C1{
    public int a = 5;
    protected int b = 6;
    int c = 7;
    private int d = 8;

    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class CH12_PackagesAndAccessModifiers {
    public static void main(String[] args) {
        C1 c = new C1();
        c.meth1();
//      System.out.println(c.d); // Error: d is a private element.
    }
}
