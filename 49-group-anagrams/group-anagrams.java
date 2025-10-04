class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        int freq[]=new int[26];
        for(String s:strs){
            Arrays.fill(freq,0);
            for(char c:s.toCharArray()){
                freq[c-'a']++;
            }
            StringBuilder key=new StringBuilder();
            for(int i=0;i<26;i++){
                key.append(freq[i]);
                key.append('#');
            }
            if(!map.containsKey(key.toString())){
                map.put(key.toString(),new ArrayList<>());
            }
            map.get(key.toString()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}