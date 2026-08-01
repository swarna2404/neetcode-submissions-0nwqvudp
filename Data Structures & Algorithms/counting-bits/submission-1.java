class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        int c=0;
        int j;
        for(int i=1;i<=n;i++){
            j=i;
            while(j!=0){
                j=j & (j-1);
                c++;
            }
            arr[i]=c;
            c=0;
        }
        return arr;
        
    }
}
