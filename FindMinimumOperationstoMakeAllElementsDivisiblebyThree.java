
import java.util.Scanner;

public class FindMinimumOperationstoMakeAllElementsDivisiblebyThree {

      public static int minimumOperations(int[] nums) {
            int count = 0;
            for (int i : nums) {
                  if (i % 3 == 1) {
                        count += 1;
                  } else if (i % 3 == 2) {
                        count += 1;
                  }
            }
            return count;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                  nums[i] = sc.nextInt();
            }
            System.out.println(minimumOperations(nums));

      }
}
