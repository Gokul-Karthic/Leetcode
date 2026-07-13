public class FaultyKeyboard {
      public String finalString(String s) {
            StringBuilder sb = new StringBuilder();
            for (char ch : s.toCharArray()) {
                  if (ch == 'i') {
                        sb.reverse();
                  } else {
                        sb.append(ch);
                  }
            }
            return sb.toString();
      }

      public static void main(String[] args) {

      }
}
