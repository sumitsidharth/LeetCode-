class Solution {
public:
    bool SearchRow(vector<vector<int>>& matrix, int target,int row){
        int n = matrix[0].size();
        int st = 0 , end = n-1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(target==matrix[row][mid]){
                return true;
            }else if(target > matrix[row][mid]){
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int n = matrix[0].size();
        int m = matrix.size();
        int st_row = 0 , end_row = m-1;
        while(st_row<=end_row){
            int mid_row = st_row + (end_row - st_row)/2;
            if(target >= matrix[mid_row][0] && target<= matrix[mid_row][n-1]){
                return SearchRow(matrix,target,mid_row);
            }else if(target>= matrix[mid_row][n-1]){
                st_row = mid_row+1;
            }else{
                end_row = mid_row - 1;
            }
        }
        return false;
    }
};