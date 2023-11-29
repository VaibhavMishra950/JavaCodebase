import java.util.Vector;

public class CH25_Vectors {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(500);
        v.add(569);
        v.add(985);
        v.add(654);
        v.add(789);
        v.add(223);
        System.out.println("IndexOf: " + v.indexOf(985));
        System.out.println("Contains: " + v.contains(789));

        for (int elem : v) {
            System.out.println(elem);
        }

    }
}
