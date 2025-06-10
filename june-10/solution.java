https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/description/?envType=daily-question&envId=2025-06-10

class Solution {
    public int maxDifference(String s) {
       HashMap<Character, Integer> freqMap = new HashMap<>();
        for(char c:s.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
         int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int freq : freqMap.values()) {
            if (freq % 2 == 1) {
                maxOdd = Math.max(maxOdd, freq);
            } else {
                minEven = Math.min(minEven, freq);
            }
        }

        // If no valid odd or even frequency found
        if (maxOdd == Integer.MIN_VALUE || minEven == Integer.MAX_VALUE) {
            return -1;
        }

        return maxOdd - minEven;
    }
    
}