class Solution {
    public int removeDuplicates(int[] nums) {
         int n = nums.length;
       if (n == 0) {
         return 0;
       }
       int i=0;
       int j =i+1;
       int count = 1;
       while(j<n){
          if(nums[i] == nums[j]){
               j++;
          }else{
               i++;
               nums[i] = nums[j];
               j++;
               count++;
          }
      }
      return count;
    }
}