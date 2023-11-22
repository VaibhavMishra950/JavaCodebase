interface Inter1{
    void meth1();
    void meth2();
}
@FunctionalInterface
interface Inter2{
    void meth1(int x);
}
public class CH22_AnonymousClassAndLambdaExp {
    public static void main(String[] args) {
        // Anonymous Class: A class without name.
        Inter1 obj1 = new Inter1() {
            @Override
            public void meth1() {
                System.out.println("This is Method 1 from Anonymous Class.");
            }

            @Override
            public void meth2() {
                System.out.println("This is method 2 from Anonymous Class.");
            }
        };
        obj1.meth2();

        // Lambda Expression: Inline definition of a method declared in a Functional Interface.
        Inter2 obj2 = (x)->{
            System.out.println("This is Lambda Expression and the value of x is: " + x);
        };
        obj2.meth1(56);
    }
}
