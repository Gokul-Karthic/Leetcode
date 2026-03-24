import java.util.Scanner;

public class BuildArrayfromPermutation {
    public static int[] buildArray(int[] nums) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[nums[i]];
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] ans = buildArray(nums);
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
    }

}
