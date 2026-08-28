class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] a = new int[arr.length];
        for(int i=0; i<arr.length;i++){
            a[i]=arr[i];
        }
        Arrays.sort(arr);
        HashMap<Integer,Integer> b= new HashMap<>();
        int j =1;
        for(int num:arr){
            if(!b.containsKey(num)){
                b.put(num,j++);
            }
        }
        for(int i =0;i<a.length;i++){
            a[i]=b.get(a[i]);
        }
        return a;
        
    }
}