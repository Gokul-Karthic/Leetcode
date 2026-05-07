import java.util.Scanner;

public class CountGoodTriplets {
      public static int countGoodTriplets(int[] arr, int a, int b, int c) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                  for (int j = i + 1; j < arr.length; j++) {
                        int x = Math.abs(arr[i] - arr[j]);
                        if (x <= a) {
                              for (int k = j + 1; k < arr.length; k++) {
                                    int y = Math.abs(arr[j] - arr[k]);
                                    int z = Math.abs(arr[i] - arr[k]);
                                    if ((x <= a) && (y <= b) && (z <= c)) {
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
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(countGoodTriplets(nums, a, b, c));
      }
}
