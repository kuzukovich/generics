package sky.pro;

import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"
    ));
    private static final List<String> words2 = new ArrayList<>(List.of("Иван", "Петя", "Вася", "Иван", "Петя"
    ));


    public static void main(String[] args) {
        // write your code here
        oddNumbers();
        evenNumbers();
        uniqueWords();
        countDoubles();
        countDoubles_v2();

    }

    public static void oddNumbers() {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void evenNumbers() {
        for (Integer num : new TreeSet<>(nums)) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void uniqueWords() {
        Set<String> uniqueKits = new LinkedHashSet<>(words);
        List<String> duplicate = new ArrayList<>(words);
        for (String uniqueKit : uniqueKits) {
            duplicate.remove(uniqueKit);
        }
        uniqueKits.removeAll(duplicate);
        System.out.println(uniqueKits);
    }

    public static void countDoubles() {
        LinkedHashSet<String> unique = new LinkedHashSet<>();
        LinkedHashSet<String> repeated = new LinkedHashSet<>();
        for (String word2 : words2) {
            if (unique.contains(word2)) {
                repeated.add(word2);
            } else {
                unique.add(word2);
            }
        }
        System.out.println(repeated.size());
    }

    public static void countDoubles_v2() {
        Set<String> uniqueKits = new HashSet<>(words2);
        System.out.println(words2.size() - uniqueKits.size());

    }

}
