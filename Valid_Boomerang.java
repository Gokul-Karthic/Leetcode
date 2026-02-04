
import java.util.Scanner;

public class Valid_Boomerang {
      public static boolean isboomerang(int[][] points) {

            return (points[1][1] - points[0][1]) * (points[2][0] - points[1][0]) != (points[2][1] - points[1][1])
                        * (points[1][0] - points[0][0]);
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[][] points = new int[3][2];
            for (int i = 0; i < 3; i++) {
                  for (int j = 0; j < 2; j++) {
                        points[i][j] = sc.nextInt();
                  }
            }
            System.out.println(isboomerang(points));
      }

}
