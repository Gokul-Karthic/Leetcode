import java.util.Scanner;

public class LeftandRightSumDifferences {
      public static int[] leftRightDifference(int[] nums) {
            int n = nums.length;
            int[] left = new int[n];
            int[] right = new int[n];
            int[] ans = new int[n];
            for (int i = 1; i < n; i++) {
                  left[i] = nums[i - 1] + left[i - 1];
            }
            for (int j = n - 2; j >= 0; j--) {
                  right[j] = nums[j + 1] + right[j + 1];
            }
            for (int k = 0; k < n; k++) {
                  ans[k] = Math.abs(left[k] - right[k]);
            }
            return ans;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                  nums[i] = sc.nextInt();
            }
            int[] ans = leftRightDifference(nums);
            for (int i : ans) {
                  System.out.println(i);
            }
      }

}
