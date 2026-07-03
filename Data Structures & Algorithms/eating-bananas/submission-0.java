class Solution {
    public boolean isPossible(int mid,int h,int[]piles){
        int sum=0;
        for(int i=0;i<piles.length;i++){
           sum+=((piles[i]+mid-1)/mid);
        }
        if(sum<=h)return true;
        return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
       int low=1;
       int high=Arrays.stream(piles).max().getAsInt();;
       int ans=high;
       while(low<=high){
        int mid=(low+high)/2;
        if(isPossible(mid,h,piles)){
            ans=mid;
            high=mid-1;
            }
        else{
            low=mid+1;
        }


       }return ans;
    }
}
