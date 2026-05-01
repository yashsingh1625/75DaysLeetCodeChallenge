class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        // Important: prefix sum 0 ek baar already exist karta hai
        map.put(0, 1);
        
        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            // check: kya (prefixSum - k) pehle aaya hai?
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            // current prefix sum ko map me store/update karo
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}