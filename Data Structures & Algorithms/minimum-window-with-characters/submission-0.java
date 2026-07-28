class Solution {
    public boolean contains(int[] mapS,int[] mapT){
        for(int i=0;i<256;i++){
            if(mapT[i]>mapS[i])return false;
        }
        return true;
    }
    public String minWindow(String s, String t) {
        int[] mapS=new int[256];
        int[] mapT=new int[256];
        int left=0;
        int right=0;
        int min=s.length()+1;
        int minStart=0;
        for(char ch:t.toCharArray()){
            mapT[ch]++;
        }
        for(;right<s.length();right++){
            mapS[s.charAt(right)]++;
            while(contains(mapS,mapT)){
                if(right-left+1<min){
                    min=right-left+1;
                    minStart=left;
                }
                mapS[s.charAt(left++)]--;
            }
        }
        return min==s.length()+1?"":s.substring(minStart,minStart+min);
        
    }
}
