class Solution {
    //frequency approach
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String word:strs){
            int[]freq=new int[26];
            for(char c:word.toCharArray()){
                freq[c-'a']++;
            }
            StringBuilder k=new StringBuilder();
            for(int c:freq){
                k.append('#');
                k.append(c);
            }
            String key=k.toString();
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
    
}
