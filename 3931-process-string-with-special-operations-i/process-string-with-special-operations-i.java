class Solution {
    public String processStr(String s) {
     String ans="";
     for(char c:s.toCharArray()){
        if(c=='*'){
            if(ans.length()>0){
                   ans=ans.substring(0,ans.length()-1);
            }
           
        }
         else if(c=='#'){
            String temp=ans;
            ans=ans+temp;
        }
         else if(c=='%'){
            String rev="";
             for(int i=ans.length()-1;i>=0;i--){
                rev+=ans.charAt(i);
             }
            ans=rev;
        }
        else{
            ans+=c;
        }
        // if(c>='a' && c<='z'){
        //     ans+=c;
        // }
     } 
     return ans;  
    }
}