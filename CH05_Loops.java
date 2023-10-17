public class CH05_Loops {
    public static void main(String[] args) {

        // Loops are used to perform repetitive tasks easily
        // 1. While loop - Runs till the given condition is true.
        System.out.println("While Loop: ");
        int i = 1;
        while(i <= 10){
            System.out.println(i);
            i++;
        }

        // 2. Do-While Loop - While Loop which runs at least once even if the condition is false.
        System.out.println("Do-While Loop: ");
        i = 1;
        do {
            System.out.println(i);
            i++;
        }while(i <= 10);

        // 3. For Loop - Runs for a range of numbers.
        System.out.println("For Loop: ");
        for (int x = 0; x<=10; x++){
            System.out.println(x);
        }

        // Control Statements
        // 1. Break - Breaks the Loop
        System.out.println("Break Statement");
        for (int x = 0; x<=5; x++){
            if (x == 2){
                break;
            }
            System.out.println(x);
        }

        // 2. Continue - Skips the current iteration and continues the Loop
        System.out.println("Continue Statement");
        for (int x = 0; x<=5; x++){
            if (x == 2){
                continue;
            }
            System.out.println(x);
        }
    }
}
