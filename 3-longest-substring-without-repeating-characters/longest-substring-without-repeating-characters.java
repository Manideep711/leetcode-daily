class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        HashSet<Character> set=new HashSet<>();
        int start=0;
        for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        while(set.contains(c)){
            set.remove(s.charAt(start));
            start++;
        }
        set.add(c);
         maxLen=Math.max(maxLen,i-start+1);
        }
        return maxLen;
    }
}