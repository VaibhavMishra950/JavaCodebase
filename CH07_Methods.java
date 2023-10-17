/*
Static Methods: A method which is associated with the class rather than the object.
Method Overloading: Multiple methods with same name but different parameters.
Variable Arguments: Used when the number of arguments is not fixed.
Recursion: When a function calls itself.
 */

public class CH07_Methods {
    // The method is being made static so that we can use it from another static method without
    // creating an object of that class.
    static int getFact(int n){
        int res = 1;
        for (int i=1; i<=n; i++){
            res *= i;
        }
        return res;
    }

    // Method Overloading
    static int processNums(int a, int b){
        return a*b;
    }
    static int processNums(int a, int b, int c){
        return a+b+c;
    }

    // Variable Arguments
    static int sum(int ...arr){
        int sum = 0;
        for (int elem: arr){
            sum += elem;
        }
        return sum;
    }
    
    // Recursion
    static int getFactRecur(int n){
        if (n < 2){
            return 1;
        }
        else {
            return n * getFactRecur(n-1);
        }
    }

    public static void main(String[] args) {
        // Methods - Block of code used to perform some specific task
        // When the size of our program grows, we need to divide it into different modules.
        // Example
        int a = 8;
        int fact = getFact(a);
        System.out.println("Factorial of " + a + " is: " + fact);
        // If the method getFact() wasn't static, we had to call it like this:
        // CH07_Methods obj = new CH07_Methods();
        // System.out.println(obj.getFact(a));

        // Passing Arguments
        // 01. Call by Value - the copy of actual value is passed
        // 02. Call by Reference - a reference to the actual value is passed
        //      In case of arrays or objects, call by reference is default.


        // Method Overloading - Multiple methods of same name which act differently.
        //                      Can be achieved by changing number or/and type of arguments.

        System.out.println("Method Overloading Examples: ");
        System.out.println(processNums(2, 3));         // 2*3 = 6
        System.out.println(processNums(2, 5, 12));  // 2+5+12 = 19


        // Variable Arguments - Removes the bound of number of arguments for a method
        //                      Using this, we can pass none or as many as we want arguments.

        System.out.println("Variable Arguments Examples:");
        System.out.println(sum());  // 0
        System.out.println(sum(2)); // 2
        System.out.println(sum(2, 5));  // 7
        System.out.println(sum(2, 6, 9));   // 17
        System.out.println(sum(2, 6, 9, 8));    // 25


        // Recursion - a function calling itself
        System.out.println("Recursion Example:");
        System.out.println("Factorial of 8 is: " + getFactRecur(8));
    }
}




