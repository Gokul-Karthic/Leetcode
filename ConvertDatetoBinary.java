import java.util.Scanner;

public class ConvertDatetoBinary {
      public static String convertDateToBinary(String date) {
            String[] s = date.split("-");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length; i++) {
                  int n = Integer.parseInt(s[i]);
                  sb.append(Integer.toBinaryString(n));
                  if (i != s.length - 1) {
                        sb.append("-");
                  }

            }
            return sb.toString();

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            System.out.println(convertDateToBinary(s));

      }
}
