class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low=0;
        int high = k-1;
        int n = nums.length;
        int sum=0;
        for(int i =low; i<=high;i++){
            sum = sum+nums[i];
            
        }
        double avsum = (double)sum/k;
        while(high<n-1){
            sum = sum - nums[low];
            low++;
            high++;
            sum = sum + nums[high];
            double avgsec = (double)sum/k;
            if(avgsec>avsum){
                avsum = avgsec;
            }

        }
        return avsum;
    }
}