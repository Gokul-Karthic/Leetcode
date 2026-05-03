
import java.util.Scanner;

public class SubtracttheandSumofDigitsofanInteger {
      public static int subtractProductAndSum(int n) {
            int mul = 1;
            int add = 0;
            while (n > 0) {
                  int temp = n % 10;
                  mul *= temp;
                  add += temp;
                  n = n / 10;
            }
            return mul - add;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(subtractProductAndSum(n));
      }

}
