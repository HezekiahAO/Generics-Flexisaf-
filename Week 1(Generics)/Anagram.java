import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        ArrayList<String[]> pairs = new ArrayList<>();
        pairs.add(new String[] {"listen", "silent"});
        pairs.add(new String[] {"hello", "world"});
        pairs.add(new String[] {"night", "thing"});
        pairs.add(new String[] {"java", "avaj"});
        pairs.add(new String[] {"apple", "banana"});

        int count = 0;
        for (String[] pair : pairs) {
            if (isAnagram(pair[0], pair[1])) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isAnagram(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }
}