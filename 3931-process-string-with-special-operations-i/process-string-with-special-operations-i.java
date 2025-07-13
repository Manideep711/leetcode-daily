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


// class Solution {
//     public String processStr(String s) {
//         // ✅ Use StringBuilder for efficient string manipulation
//         StringBuilder ans = new StringBuilder();

//         for (char c : s.toCharArray()) {
//             if (c == '*') {
//                 // ✅ delete the last character (if any)
//                 if (ans.length() > 0) {
//                     ans.deleteCharAt(ans.length() - 1);
//                 }

//             } else if (c == '#') {
//                 // ✅ append the current content of ans to itself
//                 ans.append(ans.toString());

//             } else if (c == '%') {
//                 // ✅ reverse the current string
//                 ans.reverse();

//             } else {
//                 // ✅ append the character normally
//                 ans.append(c);
//             }
//         }

//         // ✅ Convert StringBuilder back to String for return
//         return ans.toString();
//     }
// }
