class Solution {
public:
    int maximumGap(vector<int>& nums) {
        int n = nums.size();
        if(n<2){
            return 0;
        }
        sort(nums.begin(),nums.end());
        int MaxDiff = 0;
        if(n==2){
          return abs(nums[1]-nums[0]);
        }
        for(int i=0;i<n-1;i++){
          int diff = nums[i+1] - nums[i] ;
          if(diff > MaxDiff){
            MaxDiff = diff;
          }
         }
        return abs(MaxDiff);
    }
};