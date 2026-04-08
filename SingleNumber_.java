import java.util.Scanner;

public class SingleNumber_ {
      public static int singleNumber(int[] nums) {
            int ans = nums[0];
            for (int i = 1; i < nums.length; i++) {
                  ans = ans ^ nums[i];
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
            System.out.println(singleNumber(nums));
      }

}
