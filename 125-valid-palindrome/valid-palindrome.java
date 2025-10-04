class Solution {
    public boolean isPalindrome(String s) {
      int i=0;
      int j=s.length()-1;
      s=s.toLowerCase();
      while(i<j){
   if(!Character.isLetterOrDigit(s.charAt(i))){
    i++;
    continue;
   }
   if(!Character.isLetterOrDigit(s.charAt(j))){
    j--;
    continue;
   }
            char a=s.charAt(i);
            char b=s.charAt(j);
          if(a==b){
            i++;
            j--;
          }
          else{
            return false;
          }
      }
      return true;
    }
}