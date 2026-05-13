import java.util.Scanner;

public class HarshadNumber {
      public static int sumOfTheDigitsOfHarshadNumber(int x) {
            int copy = x;
            int harshad = 0;
            while (x > 0) {
                  int temp = x % 10;
                  harshad += temp;
                  x = x / 10;
            }
            if (copy % harshad == 0) {
                  return harshad;
            }
            return -1;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(sumOfTheDigitsOfHarshadNumber(n));
      }

}
