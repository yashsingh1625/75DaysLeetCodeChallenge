class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int left =0;
        int right =0;
        
       for(right =0;right<n; right++){
            
            if(nums[right]!=0){
                
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
                

            
            }
            
        }
            

    }
}