class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i =0;i<n-2;i++){
            int left = i+1;
            int r8 = n-1;
            int sum = -1*nums[i];
            if(i > 0 && nums[i] == nums[i-1]) continue;
            while(left<r8){
                int s = nums[left]+nums[r8];
                if(sum == s){
                    res.add(Arrays.asList(nums[i], nums[left], nums[r8]));
                    left++;
                    r8--;
                while(left < r8 && nums[left] == nums[left-1]){
                    left++;
                }
                 while(left < r8 && nums[r8] == nums[r8+1]){
                        r8--;
                }
                }else if(s<sum){
                    left++;
                }
                else{
                    r8--;
                }
            }
            
        }
        return res;        
    }
}