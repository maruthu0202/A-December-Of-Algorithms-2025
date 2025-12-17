import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long K = sc.nextLong();

        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }

        int start = 0;
        long sum = 0;

        for (int end = 0; end < N; end++) {
            sum += arr[end];

            while (sum > K && start <= end) {
                sum -= arr[start];
                start++;
            }

            if (sum == K) {
                System.out.println(start + " " + end);
                return;
            }
        }

        System.out.println("-1 -1");
    }
}
