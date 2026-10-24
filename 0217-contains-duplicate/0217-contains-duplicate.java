class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        //Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
        //     if(nums[i]==nums[i-1]){
        //         return true;
        //     }
        // }
        // return false;
                if (set.contains(nums[i])) {
                  return true;
                }
                set.add(nums[i]);
        }
        return false;
    }
}