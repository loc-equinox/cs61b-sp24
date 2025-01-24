import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        Integer total = 0;
        for (int i = 0; i < L.size(); i++) {
            total += L.get(i);
        }
        return total;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> evens = new ArrayList<>();
        for (int i = 0; i < L.size(); i++) {
            Integer cur = L.get(i);
            if (cur % 2 == 0) {
                evens.add(cur);
            }
        }
        return evens;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> commons = new ArrayList<>();
        for (int i : L1)
            for (int j : L2)
                if (i == j)
                    commons.add(i);
        return commons;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int total = 0;
        for (String str : words) {
            for (int j = 0; j < str.length(); j++){
                char cur = str.charAt(j);
                if (cur == c) total ++;
            }
        }
        return total;
    }
}
