class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int newArray[][]=new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            newArray[i][0]=nums[i];
             newArray[i][1]=i;
        }
        Arrays.sort(newArray,(a,b)->b[0]-a[0]);
  Arrays.sort(newArray, 0, k, (a, b) -> a[1] - b[1]);
         int[] result = new int[k];
for (int i = 0; i < k; i++) {
    result[i] = newArray[i][0];
}
return result;
    }
}