
import java.util.Scanner;

public class MaximumCountofPositiveIntegerandNegativeInteger {
      public static int maximumCount(int[] nums) {
            int neg = 0;
            int posi = 0;
            for (int i : nums) {
                  if (i < 0) {
                        neg++;
                  } else if (i > 0) {
                        posi++;
                  }
            }
            return Math.max(neg, posi);
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                  nums[i] = sc.nextInt();
            }
            System.out.println(maximumCount(nums));
      }

}
