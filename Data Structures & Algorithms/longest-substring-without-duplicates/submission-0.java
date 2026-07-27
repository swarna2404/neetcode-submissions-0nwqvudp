class Solution {
    public int lengthOfLongestSubstring(String s) {
       int left=0;
       int right=0;
       int max=0;
       Set<Character> words=new HashSet<>();
       while(right<s.length()){
            while(words.contains(s.charAt(right))){
                words.remove(s.charAt(left));
                left++;
            }
            words.add(s.charAt(right));
            max=Math.max(max,right-left+1);
            right++;
       }
       max=Math.max(max,words.size());
       return max;
    }
}
