import java.util.ArrayList;

public class generics {
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
        numbers.add(17);
        numbers.add(19);

        int count = 0;
        for (int n : numbers) {
            if (isPrime(n)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {      // start:stop:step
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}