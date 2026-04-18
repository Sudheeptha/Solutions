import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        ContainsDuplicate obj = new ContainsDuplicate();
        boolean result = obj.hasDuplicate(nums);

        System.out.println("Contains duplicate? " + result);

        sc.close();
    }

    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seenNumbers = new HashSet<>();

        for (int num : nums) {
            if (seenNumbers.contains(num)) {
                return true;
            }
            seenNumbers.add(num);
        }

        return false;
    }
}