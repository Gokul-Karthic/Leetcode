import java.util.Scanner;

public class FindPivotIndex {
      public static int pivotIndex(int[] nums) {
            int total = 0;
            for (int i : nums) {
                  total += i;
            }
            int leftTotal = 0;
            for (int i = 0; i < nums.length; i++) {
                  int rightTotal = total - leftTotal - nums[i];
                  if (rightTotal == leftTotal) {
                        return i;
                  }
                  leftTotal += nums[i];
            }
            return -1;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                  nums[i] = sc.nextInt();
            }
            System.out.println(pivotIndex(nums));
      }

}
