class Solution {
public:
    void sortColors(vector<int>& nums) {
       int n = nums.size();
       for(int i=0;i<n;i++){
          int min_idx = i;
          for(int j=i+1;j<n;j++){
            if(nums[j] < nums[min_idx]){
               min_idx = j;
            }
          }
          int temp = nums[i];
          nums[i] = nums[min_idx];
          nums[min_idx] = temp;
       }
       cout<<"Sorted Array";
       for(int i=0;i<n;i++){
         cout<<nums[i] <<" ";
       }
       cout<< endl;
    }
};     