import java.util.Scanner;

public class SortthePeople {
      public static String[] sortPeople(String[] names, int[] heights) {
            int n = names.length;
            for (int i = 0; i < n - 1; i++) {
                  for (int j = i + 1; j < n; j++) {
                        if (heights[i] < heights[j]) {
                              int temp1 = heights[i];
                              heights[i] = heights[j];
                              heights[j] = temp1;
                              String temp2 = names[i];
                              names[i] = names[j];
                              names[j] = temp2;
                        }

                  }
            }
            return names;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                  nums[i] = sc.nextInt();
            }
            String[] names = new String[n];
            for (int i = 0; i < n; i++) {
                  names[i] = sc.next();
            }
            System.out.println(sortPeople(names, nums));

      }

}
