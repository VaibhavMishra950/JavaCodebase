import java.util.Scanner;

public class CH01_BasicsAndIO {
    public static void main(String[] args) {
        // This is a single line comment.

        /*
        This is
        a multiline
        comment.
         */

        // Output
        System.out.println("Hello World!");

        // User Input - We use Scanner class to take user inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name );

        /* Similarly, we can use sc.nextInt() to take integer inputs & sc.nextFloat() to take float
        input and so on...

        We can also use sc.hasNextInt() to check if the given input is Int or not

        Basic Functions:
        Data Type       Get input       Check Type
        ------------------------------------------
        Integer         nextInt()       hasNextInt()
        Float           nextFloat()     hasNextFloat()
        Double          nextDouble()    hasNextDouble()
        String          next()          hasNext()       --> Takes only one word as input.
        Line            nextLine()      hasNextLine()   --> takes the whole line as input.
        Boolean         nextBoolean()   hasNextBoolean()

         */
        sc.close();
    }
}

