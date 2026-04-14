import java.util.Arrays;
import java.util.Scanner;

public class SquaresofaSortedArray {
      public static int[] sortedSquares(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                  nums[i] = nums[i] * nums[i];
            }
            Arrays.sort(nums);
            return nums;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                  nums[i] = sc.nextInt();
            }
            int[] ans = sortedSquares(nums);
            for (int i : nums) {
                  System.out.println(i);
            }
      }

}
