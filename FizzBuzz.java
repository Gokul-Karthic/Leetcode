import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
      public static List<String> fizzBuzz(int n) {
            List<String> ans = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                  if (i % 3 == 0 && i % 5 == 0) {
                        ans.add("FizzBuzz");
                  } else if (i % 3 == 0) {
                        ans.add("Fizz");
                  } else if (i % 5 == 0) {
                        ans.add("Buzz");
                  } else {
                        ans.add(Integer.toString(i));
                  }
            }
            return ans;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            List<String> result = fizzBuzz(n);
            for (String s : result) {
                  System.out.println(s);
            }
      }

}
