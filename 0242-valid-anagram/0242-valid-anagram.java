class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer>a = new HashMap<>();
        HashMap<Character, Integer>z = new HashMap<>();
        for(char c : s.toCharArray()){
            a.put(c,a.getOrDefault(c,0)+1);
        }
        for(char d : t.toCharArray()){
            z.put(d,z.getOrDefault(d,0)+1);
        }
        if (a.equals(z)) {
            return true;
        }
        return false;
    }
}