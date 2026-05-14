import java.util.Arrays;
import java.util.Scanner;

public class CheckisArrayisGood {
      public static boolean isGood(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length - 1;
            for (int i = 0; i < n; i++) {
                  if (nums[i] != i + 1) {
                        return false;
                  }
            }
            return nums[n] == n;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                  nums[i] = sc.nextInt();
            }
            System.out.println(isGood(nums));
      }

}
