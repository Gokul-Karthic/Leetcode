
import java.util.Scanner;

public class DefanginganIPAddress {
      public static String defangIPaddr(String address) {
            StringBuilder s = new StringBuilder();
            for (char c : address.toCharArray()) {
                  // if(Character.isDigit(c)){

                  // }
                  if (c == '.') {
                        s.append("[.]");
                  } else {
                        s.append(c);
                  }
            }

            String ans = s.toString();
            return ans;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            System.out.println(defangIPaddr(s));
      }

}
