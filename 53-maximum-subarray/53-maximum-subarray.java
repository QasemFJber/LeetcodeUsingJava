class Solution {
   public int maxSubArray(int[] nums) {
        int sum = 0,maxS = nums[0];
        for (int i=0;i<nums.length;i++){
                sum+=nums[i];
                if(sum >maxS){
                    maxS = sum;
                }
                if (sum < 0){
                    sum = 0;
                }
        }
        return maxS;
    }
}