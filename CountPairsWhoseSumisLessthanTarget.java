import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountPairsWhoseSumisLessthanTarget {
      public static int countPairs(List<Integer> nums, int target) {
            int count = 0;
            int n = nums.size();
            for (int i = 0; i < n; i++) {
                  for (int j = i + 1; j < n; j++) {
                        if (nums.get(i) + nums.get(j) < target) {
                              count++;
                        }
                  }
            }
            return count;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            List<Integer> nums = new ArrayList<>();
            for (int i : nums) {
                  i = sc.nextInt();
            }
            int target = sc.nextInt();
            System.out.println(countPairs(nums, target));
      }
}
