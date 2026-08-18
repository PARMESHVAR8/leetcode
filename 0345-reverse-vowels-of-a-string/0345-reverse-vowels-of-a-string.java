class Solution {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int len = s.length();
        int left = 0;
        int right = len-1;
        String v = "aeiouAEIOU";
        while(right > left){
            while(left < right && v.indexOf(a[left])== -1 ){
                left++;
            }
            while(left < right && v.indexOf(a[right])== -1 ){
                right--;
            }
            char temp = a[left];
            a[left] = a[right];
            a[right]=temp;
            left++;
            right--;
        }
        return new String(a);
    }
}