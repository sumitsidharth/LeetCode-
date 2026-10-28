class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        char[] t = new char[n];
        for(int i=n-1;i>=0;i--){
           t[n-1-i] = s[i];
        }
        for(int i=0;i<n;i++){
            s[i]=t[i];
        }
    }
}