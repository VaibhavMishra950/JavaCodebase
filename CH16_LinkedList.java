import java.util.LinkedList;

public class CH16_LinkedList {
    public static void main(String[] args) {
        // Methods of LinkedList are almost similar to an ArrayList
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2  =new LinkedList<>();
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

        // Extra Methods: Not in Array List
        l1.addFirst(100000);
        l1.addLast(999999);

        System.out.println("Contains: " + l1.contains(4563));
        System.out.println("IndexOf: " + l1.indexOf(56));
        System.out.println("LastIndexOf: " + l1.lastIndexOf(56));
        // l1.clear();      // Clears the List
        for (Integer integer : l1) {
            System.out.print(integer + ", ");
        }
    }
}
