class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int a =0;
        for(char c : s.toCharArray()){
            if(c =='('){
                if(a>0){
                    result.append(c);
                }
                a++;
            }else{
                a--;
                if(a>0){
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}