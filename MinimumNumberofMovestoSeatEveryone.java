import java.util.Arrays;
import java.util.Scanner;

public class MinimumNumberofMovestoSeatEveryone {
      public static int minMovesToSeat(int[] seats, int[] students) {
            Arrays.sort(seats);
            Arrays.sort(students);
            int sum = 0;
            for (int i = 0; i < seats.length; i++) {
                  sum += Math.abs(seats[i] - students[i]);
            }
            return sum;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                  nums[i] = sc.nextInt();
            }

            int[] nums2 = new int[n];
            for (int i = 0; i < n; i++) {
                  nums2[i] = sc.nextInt();
            }
            System.out.println(minMovesToSeat(nums, nums2));
      }

}
