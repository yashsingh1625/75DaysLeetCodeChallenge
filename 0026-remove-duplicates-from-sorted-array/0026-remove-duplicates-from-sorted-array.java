class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        // int result = 1;
        // int officer = 0;
        // int cm = 1;
        // while(cm<n){
        //     if(nums[cm] == nums[cm-1]){
        //         cm++;
        //         continue;
        //     }
        //     else{
        //         nums[officer+1] = nums[cm];
        //         result++;
        //         officer++;
        //         cm++;

        //     }
        // }
        // return result;

        int left = 0;
        int res = 1;
        int r8 = 1;
        while(r8<n){
            if(nums[r8] == nums[r8-1]){
                r8++;
                continue;
            }
            else{
                nums[left+1] = nums[r8];
                res++;
                r8++;
                left++;
            }
        }
        return res;
    }
}