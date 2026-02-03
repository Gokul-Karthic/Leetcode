import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class group_anagrams {
      public static List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();
            for (String word : strs) {
                  char[] chars = word.toCharArray();
                  Arrays.sort(chars);
                  String sorted = new String(chars);
                  if (!map.containsKey(sorted)) {
                        map.put(sorted, new ArrayList<>());
                  }
                  map.get(sorted).add(word);
            }
            return new ArrayList<>(map.values());
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String[] strs = new String[n];
            for (int i = 0; i < n; i++) {
                  strs[i] = sc.next();
            }
            List<List<String>> result = groupAnagrams(strs);
            for (List<String> group : result) {
                  System.out.println(group);
            }
            sc.close();

      }

}
