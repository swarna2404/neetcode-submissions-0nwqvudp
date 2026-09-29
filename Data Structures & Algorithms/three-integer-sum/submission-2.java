class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int l,r;
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>>arr=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            if(i>0&&nums[i]==nums[i-1])continue;
            l=i+1;
            r=n-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0){
                    arr.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(l<r &&nums[l]==nums[l+1])l++;
                    while(l<r &&nums[r]==nums[r-1])r--;
                    l++;
                    r--;
                }
                if(sum>0)r--;
                if(sum<0)l++;

            }
        }
        return arr;
    }
}
