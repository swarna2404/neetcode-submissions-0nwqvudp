class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean val1=false;
        boolean val2=false;
        boolean val3=false;
        for(int[] num:triplets){
            if(num[0]>target[0]||num[1]>target[1]||num[2]>target[2])continue;
            if(num[0]==target[0])val1=true;
            if(num[1]==target[1])val2=true;
            if(num[2]==target[2])val3=true;
            if(val1&&val2&&val3)return true;
        }return false;
    }
}
