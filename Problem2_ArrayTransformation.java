import java.util.*;

public class Problem2_ArrayTransformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        for (int i = 1; i < n; i++) {
            if ((arr[i] - arr[0]) % k != 0) {
                System.out.println(-1);
                return;
            }
        }
      
        Arrays.sort(arr);

        int target = arr[n / 2];

        int operations = 0;

        for (int i = 0; i < n; i++) {
            operations += Math.abs(arr[i] - target) / k;
        }

        System.out.println(operations);
    }
}
