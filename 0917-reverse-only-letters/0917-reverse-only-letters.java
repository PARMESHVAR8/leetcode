class Solution {
    public String reverseOnlyLetters(String s) {
        char[] a = s.toCharArray();
        int left = 0;
        int right = a.length-1;
        while(left < right){
            if(!Character.isLetter(a[left])){
                left++;
                continue;
            }
            if(!Character.isLetter(a[right])){
                right--;
                continue;
            }

            char temp = a[left];
            a[left]= a[right];
            a[right]= temp;
            left++;
            right--;
        }
        return new String(a);
    }
}