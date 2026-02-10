import java.util.Scanner;

public class RichestCustomerWealth {
      public static int maximumWealth(int[][] accounts) {
            int max = 0;
            for (int row = 0; row < accounts.length; row++) {
                  int sum = 0;
                  for (int col = 0; col < accounts[row].length; col++) {
                        sum += accounts[row][col];
                  }
                  if (sum > max) {
                        max = sum;
                  }
            }
            return max;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of customers: ");
            int rows = sc.nextInt();
            int cols = sc.nextInt();

            int[][] accounts = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < cols; j++) {
                        accounts[i][j] = sc.nextInt();
                  }
            }
            int result = maximumWealth(accounts);
            System.out.println("Maximum Wealth = " + result);

            sc.close();
      }
}
