// Creating a custom Generic class in Java.
class MyGeneric<T1, T2>{
    T1 t1;
    T2 t2;
    public MyGeneric(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }
    public void display(){
        System.out.println("Value of t1 is `" + t1 + "` and its class is `" + t1.getClass() + "`.");
        System.out.println("Value of t2 is `" + t2 + "` and its class is `" + t2.getClass() + "`.");
    }
    // We can also create a method using T1/T2 as return type.
    public T2 testMethod(){
        return t2;
    }
}
public class CH23_Generics {
    public static void main(String[] args) {
        MyGeneric<Integer, String> mg = new MyGeneric<>(69, "Sample String");
        mg.display();
        System.out.println("Value returned by testMethod: " + mg.testMethod());
    }
}
