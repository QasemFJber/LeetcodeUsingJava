class Solution {
    public int[] runningSum(int[] nums) {
        int pr[]= new int[nums.length];
        pr[0]= nums[0];
        for (int i = 1; i < nums.length; i++) {
            pr[i]=pr[i-1]+nums[i];
        }
        return(pr);
    }
}