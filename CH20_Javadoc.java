// Class Documentation
/**
 * This class provides methods for performing addition and multiplication operations on integers.
 *
 * @author Vaibhav Mishra
 * @since 2023
 * @version 1.0.1
 * @see <a href="https://www.geeksforgeeks.org/java/">Java Tutorials - GeeksForGeeks</a>
 */
public class CH20_Javadoc {
    /**
     * Default Constructor
     */
    CH20_Javadoc() {

    }

    // Method Documentation
    /**
     * This method can be used for adding two numbers.
     * @param a First Integer.
     * @param b Second Integer.
     * @return Sum of both the integers.
     * @deprecated This method is deprecated. Please use <code>+</code> operator.
     */
    public static int add(int a, int b){
        return a+b;
    }

    /**
     *
     * @param a First Integer.
     * @param b Second Integer.
     * @param c Third Integer.
     * @return Sum of all three integers.
     * @throws Exception if 'a' is -999.
     */
    public static int add(int a, int b, int c) throws Exception{
        if (a == -999){
            throw new Exception();
        }
        return a+b+c;
    }

    public static int multiply(int a, int b){
        return a*b;
    }
    public static int multiply(int a, int b, int c){
        return a*b*c;
    }

    /**
     * This is the main method.
     * @param args Can be used to supply command line arguments.
     */
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;

        int sumRes = add(x, z);
        int mulRes = multiply(x, y, z);

        System.out.println("sumRes: " + sumRes);
        System.out.println("mulRes: " + mulRes);
    }
}
