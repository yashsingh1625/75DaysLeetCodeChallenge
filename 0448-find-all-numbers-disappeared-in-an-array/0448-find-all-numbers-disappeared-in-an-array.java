class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n  = nums.length;
        for(int i=0;i<n;i++){
            int idx = Math.abs(nums[i])-1;
            if(nums[idx]>0){
                nums[idx] = -nums[idx];
            }
        }
        for(int j =0; j<n;j++){
            if(nums[j]>0){
                ans.add(j+1);

            }
        }
        return ans;
    }
}