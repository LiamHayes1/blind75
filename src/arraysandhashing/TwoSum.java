package arraysandhashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0 ; i < nums.length; i++) {
            int r = target - nums[i];
            if (map.containsKey(r)) {
                result[0] = i;
                result[1] = map.get(r);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
