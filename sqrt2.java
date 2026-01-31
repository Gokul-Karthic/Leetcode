
import java.util.Scanner;

public class sqrt2 {
      public static int mySqrt(int x) {
            int i = 0;
            while ((long) i * i <= x) {
                  i++;
            }
            return i - 1;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(mySqrt(n));
            sc.close();
      }

}
