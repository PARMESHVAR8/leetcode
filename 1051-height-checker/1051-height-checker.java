class Solution {
    public int heightChecker(int[] heights) {
        int ans =0;
        int a = heights.length;
        int[] arr = new int[a];
        for(int i =0; i<a; i++){
            arr[i] = heights[i];
        }
        Arrays.sort(heights);
        for(int i =0; i<a;i++){
            if(arr[i] != heights[i]){
                ans++;
            }
        }
        return ans;
    }
}