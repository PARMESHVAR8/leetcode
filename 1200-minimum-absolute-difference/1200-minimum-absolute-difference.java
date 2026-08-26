class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int s = arr.length;
        int diff = Integer.MAX_VALUE;
        for(int i =0; i<s-1; i++){
            diff = Math.min(diff,arr[i+1]-arr[i]);
        }
        List<List<Integer>> a = new ArrayList<>();
        for(int i =0; i<s-1; i++){
            if(arr[i+1]-arr[i]==diff){
                a.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return a;
    }
}