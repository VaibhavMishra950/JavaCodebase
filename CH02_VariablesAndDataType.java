public class CH02_VariablesAndDataType {
    public static void main(String[] args) {
        // Java supports Static Typing - We need to define the data type
        byte a = 56;
        short b = 199;
        int c = 45565656;
        long d = 45568454545L;
        float e = 2.69F;
        double f = 454545.65;
        char g = 'g';
        String h = "Hey There";
        boolean i = true;

        // Operators
        // Arithmetic operators - Used to perform arithmetic operations.
        int res1;
        res1 = 45 + 56;     // 101
        res1 = 45 - 23;     // 22
        res1 = 23 * 5;      // 115
        res1 = 98 / 4;      // 24 (int divided by int will return int, hence not 24.5)
        res1 = 98 % 4;      // 2

        // Assignment Operators - Used to assign values to variables.
        // =, +=, -=, etc.
        // x += 5 means x = x + 5;

        // Comparison operators - Used to Compare two values
        boolean res2;
        res2 = 45 == 95;    // false
        res2 = 45 != 95;    // true
        res2 = 45 < 95;     // true
        res2 = 45 > 95;     // false
        res2 = 45 >= 95;    // false
        res2 = 45 <= 95;    // true

        // Logical operators - Used to perform Logical Operations
        boolean res3;
        res3 = true && false;   // false
        res3 = true || false;   // true
        res3 = !true;           // false

        // Bitwise operators - Works as logical but at bit level
        int res4;
        res4 = 2 & 3;   // 2
        res4 = 2 | 3;   // 3


        // Operator Precedence and Associativity
        int x = 45 / 9 + 3 * 2;
        /*
        Operator Precedence - Which operator will be executed first

        ()          --> Higher Precedence
        * / %
        + -         --> Lower Precedence

         */

    }
}
