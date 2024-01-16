import java.util.ArrayList;
import java.util.List;

public class BackTrancking {
    public static List<List<Integer>> systemsGerenerate(int[] S, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(S, n, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtracking(int[] S, int n, int start, List<Integer> current,
                                     List<List<Integer>> result) {

        if (current.size() == n) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < S.length; i++) {
            current.add(S[i]);
            backtracking(S, n, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[] S = {1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int n = 8;

        List<List<Integer>> subsets = systemsGerenerate(S, n);

        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
