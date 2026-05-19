import java.util.Scanner;

public class MinimumCommonValue {
      public static int getCommon(int[] nums1, int[] nums2) {
            int n1 = nums1.length;
            int n2 = nums2.length;

            int i = 0, j = 0;
            while (i < n1 && j < n2) {
                  if (nums1[i] == nums2[j]) {
                        return nums1[i];
                  } else if (nums1[i] < nums2[j]) {
                        i++;
                  } else {
                        j++;
                  }
            }

            return -1;
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
            for (int i = 0; i < n; i++) {
                  nums2[i] = sc.nextInt();
            }
            System.out.println(getCommon(nums1, nums2));
      }
}
