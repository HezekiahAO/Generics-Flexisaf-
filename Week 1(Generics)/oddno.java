import java.util.ArrayList;

public class oddno {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(13);
        numbers.add(11);
        numbers.add(17);
        numbers.add(19);

        int count = 0;
        for (int n : numbers) {
            if (odd(n)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean odd(int n) {
        return n % 2 != 0;
    }
}