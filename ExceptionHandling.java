import java.util.InputMismatchException;
import java.util.Scanner;

/*
Errors:
    1. Syntax Error: When compiler finds something wrong with our program, it throws a syntax error.
    2. Logical Error: When a program compiles and runs, but produced unexpected results.
    3. Exception or Runtime Error: When an error occurs while the program is running.
       Types of Exception:
            1. Checked Exception(Compile Time Exception): Handled by Compiler.
            2. Unchecked Exception: Handled by Developer

        # Exception Class
          In Java, we can extend the Exception class to write our custom exception class.
          Important Methods:
            -> String toString()        : executed when we run System.out.print(e);
            -> void printStackTrace()   : prints Stack trace
            -> String getMessage()      : prints the Exception message

        # Try-Catch-Finally Block
          In Java, we use try-catch-finally block to handle Exceptions.
            -> try      : Code in which exception may occur
            -> catch    : Handle the exception if it occurs
            -> finally  : Runs always, no matter exception occurs or not.
                          In case of methods, finally block runs even after the return statement

        # Throw & Throws
            -> throw  : Used to throw an exception explicitly
            -> throws : Used to tell user that the method may produce an exception
 */

// EXTENDING THE EXCEPTION CLASS
class MyException extends Exception{
    @Override
    public String toString() {
        return "toString() method from MyException";
    }

    @Override
    public String getMessage() {
        return "getMessage() method from MyException";
    }
}

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

public class ExceptionHandling {
    // throws keyword is used to tell users that the method may throw an exception.
    public static double area(int r) throws NegativeRadiusException {
        if (r < 0){
            throw new NegativeRadiusException();
        }
        return 3.14 * r * r;
    }

    public static void main(String[] args) {
        // SYNTAX ERROR DEMO
        // int a = 5               // Error: No Semicolon
        // System.out.println(b);  // Error: 'b' is not defined.


        // LOGICAL ERROR DEMO
        // Program to print prime numbers from 1 to 10
        System.out.println(2);
        for (int i=1; i<5; i++){
            System.out.println(2*i+1);  // Logical Error: Prints 9 which is a composite number
        }


        // RUNTIME ERROR
        int k;
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is: " + 1000/k);
                    // Division by zero exception if value of k given is 0

        // TRY-CATCH BLOCK : Prevents blocking of program in case of exception & allows us to handle
        //                   the exception manually.
        try{
            System.out.print("Enter Another Number: ");
            int num = sc.nextInt();
            int res = 6000 / num;
            System.out.println("Result is: " + res);
        }
        catch (InputMismatchException e){   // Handles InputMismatchException
            System.out.println("Input Type should be integer.");
        }
        catch (ArithmeticException e){      // Handles ArithmeticException
            System.out.println("Arithmetic Exception Occurred");
            System.out.println(e);
        }
        catch (Exception e){                // Handles all other Exceptions
            System.out.println("Some Other Exception Occurred");
            System.out.println(e);
        }

        // Using MyException Class
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        if (x < 9){
            try {
                // throw keyword is used to throw an exception EXPLICITLY by the programmer.
                throw new MyException();
            }
            catch (Exception e){
                System.out.println(e);
                System.out.println(e.getMessage());
                // e.printStackTrace();
            }
        }

        System.out.print("Enter Radius: ");
        int radius = sc.nextInt();

        // We'll need to wrap area(r) function call inside try-catch as it throws an exception
        try {
            System.out.println("Area: " + area(radius));
        } catch (NegativeRadiusException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally Block...");
        }

    }
}
