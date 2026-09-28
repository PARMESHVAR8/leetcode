class Solution {
    public int splitNum(int num) {
        int c =0;
        int b =0;
        String s = String.valueOf(num);
        int[] a = new int[s.length()];
        for(int i =0; i<a.length; i++){
            a[i] = s.charAt(i)-'0';
        }
        Arrays.sort(a);
        for(int i =0 ; i<a.length;i+=2){
            c = c*10+a[i];
        }
        for(int i =1 ; i<a.length; i+=2){
            b = b*10+a[i];
        }
        return c+b;
    }
}