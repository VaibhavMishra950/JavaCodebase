import java.util.ArrayDeque;

public class CH17_ArrayDeque {
    public static void main(String[] args) {
        // ArrayDeque stands for Array Double Ended Queue
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(565);
        ad1.add(956);
        ad1.add(456);
        ad1.add(623);
        ad1.add(235);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1.contains(456));

        for (int x: ad1){
            System.out.print(x + (ad1.getLast() == x ? "." : ", "));
        }
    }
}
