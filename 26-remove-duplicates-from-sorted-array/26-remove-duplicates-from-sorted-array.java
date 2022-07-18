class Solution {
      public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer>arrayList = new ArrayList<>();
        arrayList.add(nums[0]);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]!=nums[i+1])
            arrayList.add(nums[i+1]);
        }
        int res[ ]= new int[set.size()];
        int i=0;
        for (int x:arrayList) {
            nums[i]= x;
            i++;
        }
        //Arrays.sort(nums);
        return arrayList.size();
    }
}