class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words=text.split(" ");
        int word=0;
        HashSet<Character> set=new HashSet<>();
        for(char c:brokenLetters.toCharArray()){
            set.add(c);
        }
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(set.contains(words[i].charAt(j))){
                        word++;
                        break;
                }
            }
        }
       return words.length - word;
    }
}