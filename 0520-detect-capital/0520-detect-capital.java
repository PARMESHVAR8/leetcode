class Solution {
    public boolean detectCapitalUse(String word) {
        int upper=0;
        int lower = 0;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)>='A'&&word.charAt(i)<='Z'){
                upper++;
            }else{
                lower++;
            }
        }
        if(upper==word.length()){
            return true;
        }
        if(lower == word.length()){
            return true;
        }
        if(upper ==1 && word.charAt(0)>='A'&& word.charAt(0)<='Z'){
            return true;
        }
        return false;
    }
}