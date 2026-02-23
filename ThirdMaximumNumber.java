import java.util.Scanner;

public class ThirdMaximumNumber {
      public static int thirdMax(int[] nums) {
            long first = Long.MIN_VALUE, second = Long.MIN_VALUE, third = Long.MIN_VALUE;

            for (int n : nums) {
                  if (n == first || n == second || n == third)
                        continue;

                  if (n > first) {
                        third = second;
                        second = first;
                        first = n;
                  } else if (n > second) {
                        third = second;
                        second = n;
                  } else if (n > third) {
                        third = n;
                  }
            }

            if (third == Long.MIN_VALUE) {
                  return (int) first;
            }

            return (int) third;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                  nums[i] = sc.nextInt();
            }
            System.out.println(thirdMax(nums));

      }

}