
import java.util.Scanner;

public class SmallestEvenMultiple {
      public static int smallestEvenMultiple(int n) {
            int m = n;
            while (n % 2 != 0 || n % m != 0) {
                  n++;
            }
            return n;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(smallestEvenMultiple(n));
      }

}
