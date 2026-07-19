class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]ans=new int[2];
        int i=-1;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            ++i;
            if(map.containsKey(target-num)){
                ans[0]=map.get(target-num);
                ans[1]=i;
            }
            else{
                map.put(num,i);
            }
        }
        return ans;
    }
}
