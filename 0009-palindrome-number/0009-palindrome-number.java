class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int original = x;
        if(x<0){
            return false;
        }
        while(x>0){
            int digit = x%10;
            int reverse = sum * 10 + digit;
            sum = reverse;
            x /= 10;
        }
        if(sum == original ){
            return true;
        }else{
            return false;
        }
    }
}