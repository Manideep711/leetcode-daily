class Solution {
    public int maxScore(String s) {
        int ones=0;
         for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ones++;
            }
         }
         int zeros=0;
         int result=0;
         for(int i=0;i<s.length()-1;i++){
             if(s.charAt(i)=='1'){
                ones--;
            }
            else{
                zeros++;
            }
            result=Math.max(result,zeros+ones);
         }
        return result;
    }
}

// class Solution {
//     public int maxScore(String s) {
//         int ones = 0, zeros = 0, maxScore = 0;
//         for (char c : s.toCharArray()) ones += c == '1' ? 1 : 0;
//         for (int i = 0; i < s.length() - 1; i++) {
//             if (s.charAt(i) == '0') zeros++;
//             else ones--;
//             maxScore = Math.max(maxScore, zeros + ones);
//         }
//         return maxScore;
//     }
// }
