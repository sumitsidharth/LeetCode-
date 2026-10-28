class Solution {
    public void reverseString(char[] s) {
        int n = s.length,i=0,j=n-1;
        // char[] t = new char[n];
        // for(int i=n-1;i>=0;i--){
        //    t[n-1-i] = s[i];
        // }
        // for(int i=0;i<n;i++){
        //     s[i]=t[i];
        // }
        while(i<j){
            char temp = s[i];
            s[i]=s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}