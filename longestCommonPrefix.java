
import java.util.Arrays;
import java.util.Scanner;

public class longestCommonPrefix {
      public static String lsc(String[] arr) {
            Arrays.sort(arr);
            String s1 = arr[0];
            String s2 = arr[arr.length - 1];
            int pointer = 0;
            while ((pointer < s1.length()) && (pointer < s2.length())) {
                  if (s1.charAt(pointer) == s2.charAt(pointer)) {
                        pointer++;
                  } else {
                        break;
                  }
            }
            return s1.substring(0, pointer);

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                  arr[i] = sc.next();
            }
            String ans = lsc(arr);
            System.out.println(ans);

      }

}
