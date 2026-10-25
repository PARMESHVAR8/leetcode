class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> a = new HashMap<>();
        for(char c: s.toCharArray()){
            a.put(c,a.getOrDefault(c,0)+1);
        }
        for(char c : t.toCharArray()){
            if(!a.containsKey(c)|| a.get(c)==0){
                return c;
            }
            a.put(c,a.get(c)-1);
        }
        return ' ';
    }
}