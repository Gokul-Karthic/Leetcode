import java.util.Scanner;

public class MaximumSubarray {
      public static int maxSubArray(int[] arr) {
            int maxsum = arr[0];
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                  sum += arr[i];
                  maxsum = Math.max(sum, maxsum);
                  if (sum < 0) {
                        sum = 0;
                  }
            }
            return maxsum;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                  nums[i] = sc.nextInt();
            }
            System.out.println(maxSubArray(nums));

      }

}