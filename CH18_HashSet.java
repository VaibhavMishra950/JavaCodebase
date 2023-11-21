import java.util.HashSet;

public class CH18_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>(20, 0.8f);
        hs1.add(56);
        hs1.add(32);
        hs1.add(98);
        hs1.add(48);
        hs1.add(11);
        System.out.println(hs1);
    }
}
