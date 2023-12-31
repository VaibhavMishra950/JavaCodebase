import java.util.ArrayList;

public class CH15_ArrayList {
    public static void main(String[] args) {
        /*
         <Integer>, here, comes from Generics. It is used to tell the compiler that we are going to
         create an ArrayList which will store only Integer values.
         It helps in reducing the bugs and facilitates better type-checking.
         We can't use primitive data types here, we have to use the Class name, hence, ArrayList<int>
         will produce an error.
        */
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2  =new ArrayList<>(5);
        l2.add(9898);
        l2.add(4563);
        l2.add(6598);
        l1.add(56);
        l1.add(95);
        l1.add(69);
        l1.add(56);
        l1.add(45);
        l1.add(65);
        l1.add(1, 999);
        l1.set(2, 999999);
        l1.addAll(l2);

        System.out.println("Contains: " + l1.contains(4563));
        System.out.println("IndexOf: " + l1.indexOf(56));
        System.out.println("LastIndexOf: " + l1.lastIndexOf(56));
        // l1.clear();      // Clears the List
        for (Integer integer : l1) {
            System.out.println(integer + ", ");
        }
    }
}
