import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountItemsMatchingaRule {
      public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            int count = 0;
            int key = 0;
            if (ruleKey.equals("type")) {
                  key = 0;
            } else if (ruleKey.equals("color")) {
                  key = 1;
            } else {
                  key = 2;
            }
            for (int i = 0; i < items.size(); i++) {

                  if (items.get(i).get(key).equals(ruleValue)) {
                        count++;
                  }

            }
            return count;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Number of items
            int n = sc.nextInt();

            // Consume newline
            sc.nextLine();

            List<List<String>> items = new ArrayList<>();

            // Input items
            for (int i = 0; i < n; i++) {

                  List<String> temp = new ArrayList<>();

                  // type
                  String type = sc.next();

                  // color
                  String color = sc.next();

                  // name
                  String name = sc.next();

                  temp.add(type);
                  temp.add(color);
                  temp.add(name);

                  items.add(temp);
            }

            // Input ruleKey
            String ruleKey = sc.next();

            // Input ruleValue
            String ruleValue = sc.next();
            System.out.println(countMatches(items, ruleKey, ruleValue));

      }

}
