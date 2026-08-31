class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[] score = new int[rows];
        for(int i =0; i<rows; i++){
            for(int j =0; j<cols;j++){
                if(mat[i][j]==1){
                    score[i]++;
                }else{
                    break;
                }
            }
        }
        List<Integer> c = new ArrayList<>();
        for(int i =0; i<rows; i++){
            c.add(i);
        }
        Collections.sort(c,(a,b)->{
            if(score[a]==score[b]){
                return a-b;
            }
            return score[a]-score[b];
        });
        int[]res = new int[k];
        for(int i =0; i<k;i++){
            res[i]=c.get(i);
        }
        return res;
    }
}