import java.util.Scanner;

public class NumberofEmployeesWhoMettheTarget {
      public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
            int count = 0;
            for (int i : hours) {
                  if (i >= target) {
                        count++;
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
            int tar = sc.nextInt();
            System.out.println(numberOfEmployeesWhoMetTarget(nums, tar));
      }

}
