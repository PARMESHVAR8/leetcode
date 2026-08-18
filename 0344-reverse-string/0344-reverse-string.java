class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        int first = 0;
        int last = len-1;
        while(last > first){
            char temp = s[first];
            s[first] = s[last];
            s[last] = temp;
            first++;
            last--;
        }
    }
}