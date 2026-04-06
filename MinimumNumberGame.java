import java.util.Arrays;
import java.util.Scanner;

public class MinimumNumberGame {
      public static int[] numberGame(int[] nums) {
            Arrays.sort(nums);
            int[] ans = new int[nums.length];
            for (int i = 0; i < nums.length; i += 2) {
                  ans[i] = nums[i + 1];
                  ans[i + 1] = nums[i];
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
            int[] ans = numberGame(nums);
            for (int i : ans) {
                  System.out.println(i);
            }

      }

}
