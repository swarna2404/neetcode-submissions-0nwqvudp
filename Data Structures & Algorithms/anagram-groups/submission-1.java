class Solution {
    //sort approach
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>>map=new HashMap<>();
       for(String word:strs) {
        char[] str=word.toCharArray();
        Arrays.sort(str);
        String key=new String(str);
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(word);
       }
       return new ArrayList<>(map.values());
    }
}
