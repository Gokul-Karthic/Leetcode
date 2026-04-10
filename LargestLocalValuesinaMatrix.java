import java.util.Scanner;

public class LargestLocalValuesinaMatrix {
      private static int findMax(int[][] grid, int x, int y) {
            int max = 0;
            for (int i = x; i < x + 3; i++) {
                  for (int j = y; j < y + 3; j++) {
                        max = Math.max(max, grid[i][j]);
                  }
            }
            return max;
      }

      public static int[][] largestLocal(int[][] grid) {
            int n = grid.length;
            int[][] ans = new int[n - 2][n - 2];
            for (int i = 0; i < n - 2; i++) {
                  for (int j = 0; j < n - 2; j++) {

                        int max = 0;
                        for (int k = i; k < i + 3; k++) {
                              for (int m = j; m < j + 3; m++) {
                                    max = Math.max(max, grid[k][m]);
                              }
                        }
                        ans[i][j] = max;
                  }
            }
            return ans;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int[][] grid = new int[n][n];

            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < n; j++) {
                        grid[i][j] = sc.nextInt();
                  }
            }

            int[][] result = largestLocal(grid);

            System.out.println("Result Matrix:");
            for (int i = 0; i < result.length; i++) {
                  for (int j = 0; j < result[0].length; j++) {
                        System.out.print(result[i][j] + " ");
                  }
                  System.out.println();
            }

            sc.close();
      }

}
