import java.util.ArrayList;

public class Palindrome {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("racecar");
        words.add("level");
        words.add("noon");
        words.add("hello");
        words.add("java");
        words.add("madam");
        words.add("world");
        words.add("stats");


        int count = 0;
        for (String word : words) {
            if (isPalindrome(word)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isPalindrome(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return word.equals(reversed);
    }
}