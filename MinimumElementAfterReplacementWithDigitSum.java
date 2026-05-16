import java.util.Scanner;

public class MinimumElementAfterReplacementWithDigitSum {
      public static int minElement(int[] nums) {
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                  int n = 0;
                  while (nums[i] > 0) {
                        int temp = nums[i] % 10;
                        n += temp;
                        nums[i] /= 10;
                  }
                  ans = Math.min(ans, n);
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
            System.out.println(minElement(nums));

      }

}
