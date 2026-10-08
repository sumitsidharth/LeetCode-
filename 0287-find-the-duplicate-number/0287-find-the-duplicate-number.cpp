class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        int n = nums.size();
        unordered_set<int> ans;
        for(int i=0;i<n;i++){
            if(ans.find(nums[i])== ans.end()){
              ans.insert(nums[i]);
            }else{
             return nums[i];
            }
        }
        return -1;
    }
};