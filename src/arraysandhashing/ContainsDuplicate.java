package arraysandhashing;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> counts = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (counts.contains(nums[i])) {
                return true;
            }
            counts.add(nums[i]);
        }
        return false;
    }
}
