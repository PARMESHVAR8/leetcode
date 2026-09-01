class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> a = new TreeSet<>();
        for(int x :nums){
            a.add(x);
        }
        while(a.size()>3){
            a.pollFirst();
        }
        if(a.size()<3){
            return a.last();
        }
        return a.first();
    }
}