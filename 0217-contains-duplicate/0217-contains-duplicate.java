class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> mp = new HashSet<>();
        for (int num : nums) {
            if (mp.contains(num)) {
                return true;
            }
            mp.add(num);
        }
        return false;
    }
}