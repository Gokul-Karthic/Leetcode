import java.util.Scanner;

public class FindtheNumberofGoodPairsI {
      public static int numberOfPairs(int[] nums1, int[] nums2, int k) {
            int count = 0;
            for (int i = 0; i < nums1.length; i++) {
                  for (int j = 0; j < nums2.length; j++) {
                        if ((nums1[i] % (nums2[j] * k) == 0)) {
                              count++;
                        }
                  }
            }
            return count;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums1 = new int[n];
            for (int i = 0; i < n; i++) {
                  nums1[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            int[] nums2 = new int[m];
            for (int i = 0; i < m; i++) {
                  nums2[i] = sc.nextInt();

            }
            int k = sc.nextInt();
            System.out.println(numberOfPairs(nums1, nums2, k));

      }
}
