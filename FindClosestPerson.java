
import java.util.Scanner;

public class FindClosestPerson {
      public static int findClosest(int x, int y, int z) {
            if (Math.abs(x - z) < Math.abs(y - z)) {
                  return 1;
            } else if (Math.abs(x - z) > Math.abs(y - z)) {
                  return 2;
            } else {
                  return 0;
            }

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            System.out.println(findClosest(x, y, z));
      }
}
