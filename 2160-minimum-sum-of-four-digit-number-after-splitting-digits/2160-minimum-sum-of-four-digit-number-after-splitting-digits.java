class Solution {
    public int minimumSum(int num) {
        int[] a = String.valueOf(num).chars().map(c->c-'0').toArray();
        Arrays.sort(a);
        int num1 = a[0]*10+a[3];
        int num2 = a[1]*10+a[2];
        return num1+num2;
    }
}