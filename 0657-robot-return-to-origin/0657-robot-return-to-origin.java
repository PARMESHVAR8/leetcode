class Solution {
    public boolean judgeCircle(String moves) {
        // HashMap<Character, Integer> z = new HashMap<>();
        // char[] a = moves.toCharArray();
        // for(int i =0; i<a.length; i++){
        //     z.put(a.getOrDefault(z,0)+1);
        // }
        int z=0;
        int b=0;
        int c=0;
        int d=0;
        char[] a = moves.toCharArray();
        for(int i =0; i<a.length; i++){
            if(a[i]=='R'){
                z++;
            }
            else if(a[i]=='L'){
                b++;
            }
            if(a[i]=='U'){
                c++;
            }
            if(a[i]=='D'){
                d++;
            }                                   
        }
        if(z==b&&c==d){
            return true;
        }return false;
    }
}