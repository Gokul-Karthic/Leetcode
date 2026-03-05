import java.util.Scanner;
import java.util.Stack;

public class ValidParantheses {
      public static boolean isValid(String s) {
            Stack<Character> st = new Stack<>();
            char[] arr = s.toCharArray();
            for (int i = 0; i < arr.length; i++) {

                  if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
                        st.push(arr[i]);
                  } else if (arr[i] == ')' || arr[i] == '}' || arr[i] == ']') {
                        if (st.isEmpty()) {
                              return false;
                        }
                        char ch = st.pop();
                        if ((arr[i] == ')' && ch != '(') || (arr[i] == '}' && ch != '{')
                                    || (arr[i] == ']' && ch != '[')) {
                              return false;
                        }

                  }
            }
            return st.isEmpty();

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            System.out.println(isValid(s));
      }

}
