class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] a = new int[n];
        for(int i =0; i<n;i++){
            a[i]=score[i];
        }
        Arrays.sort(score);
        for(int i=0;i<n/2;i++){
            int temp = score[i];
            score[i] = score[n-1-i];
            score[n-1-i]=temp;
        }
        String[] ans = new String[n];
        for(int i =0; i<n;i++){
            for(int j=0; j<n;j++){
                if(a[i]==score[j]){
                    if(j==0){
                        ans[i] = "Gold Medal";
                    }else if(j==1){
                        ans[i] = "Silver Medal";
                    }
                    else if(j==2){
                        ans[i] = "Bronze Medal";
                    }else{
                        ans[i] = String.valueOf(j + 1);
                    }
                    break;
                }
            }
        }
        return ans;
    }
}