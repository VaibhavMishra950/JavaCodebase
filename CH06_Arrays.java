public class CH06_Arrays {
    public static void main(String[] args) {
        // Arrays - Collection of elements of similar data types
        // Declaration and Initialization
        // Method 01:
        int [] m1 = new int[5];
        m1[0] = 65;
        System.out.println(m1[0]);

        // Method 02:
        int [] m2 = {100, 65, 52, 95, 65};
        System.out.println(m2[2]);

        // Displaying the Elements of an Array
        // 01. Individually Using Their Indices:
        System.out.println("Individually Using Their Indices:");
        System.out.println(m2[0]);
        System.out.println(m2[1]);
        System.out.println(m2[2]);
        System.out.println(m2[3]);
        System.out.println(m2[4]);

        // 02. Using the Basic For Loop:
        System.out.println("Using the Basic For Loop:");
        for (int i=0; i<m2.length; i++){
            System.out.println(m2[i]);
        }

        // 03. Using the Enhanced For Loop (Also Called ForEach Loop):
        System.out.println("Using the Enhanced For Loop (Also Called ForEach Loop):");
        for (int element : m2) {
            System.out.println(element);
        }

        // Multi-Dimensional Array - An array with more than one dimension.
        // Example: A 2-D array
        int [][] flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        // It Also Can be displayed individually or using nested for loops
        // Example:
        System.out.println("Printing 2-D Array Using Nested For Loop:");
        for (int[] flat : flats) {
            for (int i : flat) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
