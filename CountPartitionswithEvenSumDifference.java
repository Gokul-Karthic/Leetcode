import java.util.Scanner;

public class CountPartitionswithEvenSumDifference {
      public static int countPartitions(int[] nums) {
            int count = 0;
            int n = nums.length;
            int tsum = 0;
            for (int i = 0; i < n; i++) {
                  tsum += nums[i];
            }
            if (tsum % 2 != 0) {
                  return 0;
            }
            return n - 1;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                  nums[i] = sc.nextInt();
            }
            System.out.println(countPartitions(nums));
      }

}
