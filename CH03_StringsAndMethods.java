import java.util.Scanner;

/*
String: A string is a collection of characters.
 */

public class CH03_StringsAndMethods {
    public static void main(String[] args) {
        // Java provides us with a class named as "String" to create strings
        String name1 = new String("Krishna");

        // The above statement can be simplified as
        String name2 = "Krishna";

        System.out.println(name1);
        System.out.println(name2);

        // Along with println, we can also use printf and format functions to print strings
        // Examples:
        int x = 65;
        float y = 6.35956f;
        System.out.printf("Value of x is %d\n", x);
        System.out.format("Value of y is %8.2f\n", y);

        // Taking string input - next() & nextLine() functions
        Scanner sc = new Scanner(System.in);
        System.out.println();

        // STRING METHODS
        String fact = "Mitochondria is the Power House of the Cell.";

        // Returns the length of the string.
        System.out.printf("Length(): %d\n", fact.length());

        // Returns the string in lowercase.
        System.out.printf("Lowercase(): %s\n", fact.toLowerCase());

        // Returns the string in uppercase.
        System.out.printf("Uppercase(): %s\n", fact.toUpperCase());

        // Returns the string after removing leading and trailing whitespaces.
        System.out.printf("Trimmed(): %s\n", fact.trim());

        // Returns a substring of the given string.
        System.out.printf("Substring(): %s\n", fact.substring(2, 20));  // tochondria is the

        // Replaces given character/string with another.
        System.out.printf("Replaced(): %s\n", fact.replace('t', '_'));
        System.out.printf("Replaced(): %s\n", fact.replace("Power House", "Hehe"));

        // Checks if the given string starts with the given string or not.
        System.out.printf("StartsWith(): %b\n", fact.startsWith("Mito"));

        // Checks if the given string ends with the given string or not.
        System.out.printf("EndsWith(): %b\n", fact.endsWith("Mito"));

        // Returns the character at given index.
        System.out.printf("CharAt(): %c\n", fact.charAt(35));

        // Returns the index of the given char/string starting from left/given value.
        System.out.printf("IndexOf(): %d\n", fact.indexOf("the"));
        System.out.printf("IndexOf(): %d\n", fact.indexOf("the", 5));

        // Returns the index of the given char/string starting from right/given value.
        System.out.printf("LastIndexOf(): %d\n", fact.lastIndexOf("the"));
        System.out.printf("LastIndexOf(): %d\n", fact.lastIndexOf("the", 43));

        // Checks for equality of two strings.
        System.out.printf("Equals(): %s\n",
                fact.equals("Mitochondria is the Power House of the Cell."));

        // Same as equals(), but it ignores the letter-case.
        System.out.printf("EqualsIgnoreCase(): %s\n",
                fact.equalsIgnoreCase("Mitochondria IS the power HOUSE of the ceLl."));


    }
}
