import java.util.Scanner;

public class NumberofArithmeticTriplets {
      public static int arithmeticTriplets(int[] nums, int diff) {
            int n = nums.length;
            int count = 0;
            for (int i = 0; i < n; i++) {
                  for (int j = i + 1; j < n; j++) {
                        if (nums[j] - nums[i] == diff) {
                              for (int k = j + 1; k < n; k++) {
                                    if (nums[k] - nums[j] == diff) {
                                          count++;
                                    }
                              }
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
            int diff = sc.nextInt();
            System.out.println(arithmeticTriplets(nums, diff));
      }

}
