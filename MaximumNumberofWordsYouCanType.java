public class MaximumNumberofWordsYouCanType {
      public int canBeTypedWords(String text, String brokenLetters) {
            String[] words = text.split(" ");
            int count = 0;
            for (String word : words) {
                  boolean flag = true;
                  for (char c : brokenLetters.toCharArray()) {
                        if (word.indexOf(c) != -1) {
                              flag = false;
                              break;
                        }
                  }
                  if (flag)
                        count++;
            }
            return count;
      }
}
