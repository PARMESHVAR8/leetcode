class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] s = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> a= new HashSet<>();
        for(String word : words){
            StringBuilder code = new StringBuilder();
            for(char c : word.toCharArray()){
                int index = c-'a';
                code.append(s[index]);
            }
            a.add(code.toString());
        }
        return a.size();

    }
}