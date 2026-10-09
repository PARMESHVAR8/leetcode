class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for(int i=s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            if(c=='-'){
                continue;
            }
            c = Character.toUpperCase(c);
            if(count == k){
                result.append('-');
                count =0;
            }
            result.append(c);
            count++;
        }
        return result.reverse().toString();
    }
}