import java.util.Scanner;

public class CountNumberofPairsWithAbsoluteDifferenceK {
      public static int countKDifference(int[] nums, int k) {
            int n = nums.length;
            int count = 0;
            for (int i = 0; i < n; i++) {
                  for (int j = i + 1; j < n; j++) {
                        if (Math.abs(nums[i] - nums[j]) == k) {
                              count++;
                        }

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
            int k = sc.nextInt();
            System.out.println(countKDifference(nums, k));
      }

}
