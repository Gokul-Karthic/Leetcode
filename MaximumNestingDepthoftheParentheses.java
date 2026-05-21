import java.util.Scanner;
import java.util.Stack;

public class MaximumNestingDepthoftheParentheses {
      public static int maxDepth(String s) {
            int depth = 0;
            Stack<Character> st = new Stack<Character>();
            for (char c : s.toCharArray()) {
                  if (c == '(') {
                        st.push(c);
                  } else if (c == ')') {
                        st.pop();
                  }
                  depth = Math.max(depth, st.size());
            }
            return depth;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            System.out.println(maxDepth(s));
      }
}
