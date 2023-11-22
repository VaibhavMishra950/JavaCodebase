import java.time.LocalTime;

/*
    Annotations in Java are used to provide some extra information about the code.
      -> @Override - Indicates that the method is overriding another method from its superclass.
      -> @SuppressWarnings("deprecation") - Used to suppress given type of warnings. Deprecation
                                            warning in this case.
      -> @Deprecated - Indicates that the process has been deprecated.
      -> @FunctionalInterface - Indicates that the interface is functional, i.e., It can contain
                                only one abstract method.
*/

@FunctionalInterface
interface MyFunctionalInterface{
    void testMethod();
}
class Phone{
    public void showTime(){
        System.out.println("Current time: 10PM");
    }
}
class AnotherPhone extends Phone{
    @Override
    public void showTime(){
        System.out.println("Current Time: " + LocalTime.now());
    }
    @Deprecated
    public void sayHello(){
        System.out.println("Hello.");
    }
}
@SuppressWarnings("deprecation")
public class CH21_Annotations {
    public static void main(String[] args) {
        AnotherPhone p = new AnotherPhone();
        p.showTime();
        p.sayHello();
    }
}
