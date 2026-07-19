class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr=new int[26];
        int val,num;
        for(int i=0;i<s.length();i++){
             val=s.charAt(i)-97;
            arr[val]+=1;
        }
        for(int i=0;i<t.length();i++){
            val=t.charAt(i)-97;
            num=arr[val];
            if(num-1<0)return false;
            arr[val]=arr[val]-1;
        }
        for(int i=0;i<arr.length;i++){
            if (arr[i]!=0)return false;
        }
        return true;

    }
}
