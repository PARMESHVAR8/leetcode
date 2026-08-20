class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();

        for(int i =0 ; i<nums1.length; i++){
            a.add(nums1[i]);
        }
        for(int j =0; j<nums2.length; j++){
            if(a.contains(nums2[j])){
                b.add(nums2[j]);
            }
        }
        int[] ans = new int[b.size()];
        int i =0;
        for(int nums:b){
            ans[i]=nums;
            i++;
        }
        return ans;
    }
}