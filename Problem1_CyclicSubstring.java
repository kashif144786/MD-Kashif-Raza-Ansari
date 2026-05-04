import java.util.*;

public class Problem1_CyclicSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();

        String doubled = s + s;

        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            Set<Character> set = new HashSet<>();
            int sum = 0;

            for (int j = i; j < i + n; j++) {
                char ch = doubled.charAt(j);

                if (set.contains(ch)) break;

                set.add(ch);
                sum += (ch - 'a' + 1);

                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
    }
}
