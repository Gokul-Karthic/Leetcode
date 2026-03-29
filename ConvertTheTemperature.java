
import java.util.Scanner;

public class ConvertTheTemperature {
      public static double[] convertTemperature(double celsius) {
            double[] ans = new double[2];
            ans[0] = celsius + 273.15;
            ans[1] = celsius * 1.8 + 32;
            return ans;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double c = sc.nextDouble();
            System.out.println(convertTemperature(c));
      }
}
