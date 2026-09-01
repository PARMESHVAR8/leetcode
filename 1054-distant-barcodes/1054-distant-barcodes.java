class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        int n= barcodes.length;
        int max =0;
        for(int x : barcodes){
            max = Math.max(max,x);
        }
        int[] freq = new int[max+1];
        for(int x : barcodes){
            freq[x]++;
        }
        int mostfreq =0;
        for(int i =0; i<= max; i++){
            if(freq[i]>freq[mostfreq]){
                mostfreq =i;
            }
        }
        int index =0;
        while (freq[mostfreq] > 0) {
            barcodes[index] = mostfreq;
            index += 2;
            freq[mostfreq]--;
        }
        for(int i =0; i<=max; i++){
            while(freq[i]>0){
                if(index >= n){
                    index =1;
                }
                barcodes[index]=i;
                index +=2;
                freq[i]--;
            }
        }
        return barcodes;
    }
}