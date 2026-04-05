import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KidsWiththeGreatestNumberofCandies {
      public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int max = 0;
            int n = candies.length;
            for (int i = 0; i < n; i++) {
                  max = Math.max(max, candies[i]);
            }
            List<Boolean> ans = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                  if ((candies[i] + extraCandies) >= max) {
                        ans.add(true);
                  } else {
                        ans.add(false);
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
            int e = sc.nextInt();
            List<Boolean> ans = kidsWithCandies(nums, e);
            System.out.println(ans);

      }

}
