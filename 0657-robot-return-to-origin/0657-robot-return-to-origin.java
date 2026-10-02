class Solution {
    public boolean judgeCircle(String moves) {
        int z=0;
        int b=0;
        char[] a = moves.toCharArray();
        for(int i =0; i<a.length; i++){
            if(a[i]=='R'){
                z++;
            }
            else if(a[i]=='L'){
                z--;
            }
            if(a[i]=='U'){
                b++;
            }
            if(a[i]=='D'){
                b--;
            }                                   
        }
        if(z==0&&b==0){
            return true;
        }return false;
    }
}