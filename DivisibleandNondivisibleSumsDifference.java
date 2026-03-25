import java.util.Scanner;

public class DivisibleandNondivisibleSumsDifference {
      public static int differenceOfSums(int n, int m) {
            int num1 = 0;
            int num2 = 0;
            for (int i = 1; i <= n; i++) {
                  if (i % m == 0) {
                        num1 += i;
                  } else {
                        num2 += i;
                  }
            }
            return num2 - num1;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(differenceOfSums(n, m));
      }
}
