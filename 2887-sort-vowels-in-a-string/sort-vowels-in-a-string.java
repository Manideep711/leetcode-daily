class Solution {
    public String sortVowels(String s) {
     List<Character> vowels=new ArrayList<>();
     for(char c:s.toCharArray()){
        if("AEIOUaeiou".indexOf(c)!=-1){
            vowels.add(c);
        }
     }
        Collections.sort(vowels);
        StringBuilder result=new StringBuilder();
        int vindex=0;
        for(char c:s.toCharArray()){
            if("AEIOUaeiou".indexOf(c)!=-1){
                result.append(vowels.get(vindex++));
            }
            else{
                result.append(c);
            }
        }
        return result.toString();
     }
}