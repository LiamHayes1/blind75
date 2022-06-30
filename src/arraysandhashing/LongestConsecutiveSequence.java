package arraysandhashing;

import java.util.Arrays;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] n = {100, 4, 200, 1, 3, 2};
        int r = longestConsecutive(n);
        System.out.println(r);
    }

    public static int longestConsecutive(int[] nums) {
            if (nums.length == 0) return 0;
            Arrays.sort(nums);

            int longest = 1, current = 1;

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    if (nums[i] == (nums[i - 1] + 1)) current++;
                    else {
                        longest = Math.max(longest, current);
                        current = 1;
                    }
                }
            }

            return Math.max(longest, current);
    }
}
