import java.util.Scanner;

public class MinimumOperationstoExceedThresholdValueI {
      public static int minOperations(int[] nums, int k) {
            int n = nums.length;
            int op = 0;
            for (int i = 0; i < n; i++) {
                  if (nums[i] < k) {
                        op++;
                  }
            }
            return op;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            System.out.println(minOperations(arr, k));
      }

}
