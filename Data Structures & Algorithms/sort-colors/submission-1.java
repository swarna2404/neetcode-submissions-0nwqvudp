class Solution {
    public void swap(int[]nums,int i1,int i2){
        int temp=nums[i1];
        nums[i1]=nums[i2];
        nums[i2]=temp;
    }
    public void sortColors(int[] nums) {
     int left=0;
     int right=nums.length-1;
     int mid=0;
     while(mid<=right){
        if(nums[mid]==0){
        swap(nums,mid,left);
        left++;
        mid++;}
        else if(nums[mid]==2){
            swap(nums,mid,right);
            right--;}
        else mid++;
     }
       
    }
}