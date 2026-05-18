import java.util.Scanner;

public class BitwiseORofEvenNumbersinanArray {
      public static int evenNumberBitwiseORs(int[] nums) {
            int ans = 0;
            for (int i = 0; i < nums.length; i++) {
                  if (nums[i] % 2 == 0) {
                        ans = ans | nums[i];
                  }
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
            System.out.println(evenNumberBitwiseORs(nums));

      }

}
