import java.util.Scanner;

public class MinimumOperationstoMakeArraySumDivisiblebyK {
      public static int minOperations(int[] nums, int k) {

            int ans = 0, n = nums.length;
            for (int i = 0; i < n; i++)
                  ans += nums[i];
            return ans % k;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                  nums[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            System.out.println(minOperations(nums, k));
      }

}
