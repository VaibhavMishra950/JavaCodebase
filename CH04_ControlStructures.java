import java.util.Scanner;

/*
Control Structures: They are used to control the flow of the program
    -> If-ElseIf-Else : Used to take decision based on conditions.
    -> Switch         : Used to take decision based on values.
 */

public class CH04_ControlStructures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        // IF-ELSE
        if (age < 18){
            System.out.println("You Can't Drive!");
        }
        else if (age > 120) {
            System.out.println("What the hell bro, you are dead!!");
        }
        else{
            System.out.println("You can Vote BJP.");
        }

        // SWITCH STATEMENTS
        // Switch statements in Java can be used with Integers, Characters as well as Strings.
        // Normal Switch Statement
        String name = sc.next();

        switch (name){
            case "Ram":
                System.out.println("Hello Ram");
                System.out.println("How Are You?");
                System.out.println("I hope you are doing good.");
                break;
            case "Krishna":
                System.out.println("Hello Krishna");
                break;
            default:
                System.out.println("Hello Sir");
        }

        // Enhanced Switch Statement
        switch (name) {
            case "Ram" -> {
                System.out.println("Hello Ram");
                System.out.println("How Are You?");
                System.out.println("I hope you are doing good.");
            }
            case "Krishna" -> System.out.println("Hello Krishna");
            default -> System.out.println("Hello Sir");
        }
    }

}
