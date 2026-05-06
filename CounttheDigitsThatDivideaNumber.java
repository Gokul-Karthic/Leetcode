
import java.util.Scanner;

public class CounttheDigitsThatDivideaNumber {
      public static int countDigits(int num) {
            int count = 0;
            int copy = num;
            while (num > 0) {
                  int temp = num % 10;
                  if (copy % temp == 0) {
                        count++;
                  }
                  num = num / 10;
            }
            return count;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(countDigits(n));
      }

}
