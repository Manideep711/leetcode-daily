class Solution {
    public int waysToSplitArray(int[] nums) {
        long rightsum=0;
        long leftsum=0;
        int count=0;
        for(int x:nums){
            rightsum+=x;
        }
        for(int i=0;i<nums.length-1;i++){
            leftsum+=nums[i];
            rightsum-=nums[i];
            if(leftsum>=rightsum){
                count++;
            }
        }
        return count;
    }
}
//prefix sum

// class Solution {
//     public int waysToSplitArray(int[] nums) {
//         int n=nums.length;
//         int m=n+1;
//         long[] arr=new long[m];
//         int cnt=0;

//         //Doing the Prefix sum
//         arr[0]=0;
//         for(int i=1; i<m; i++){
//             arr[i]=arr[i-1]+nums[i-1];
//         }

//         //Checking a valid split 
//         for(int i=1; i<m-1; i++){
//             if(arr[i] >= arr[m-1]-arr[i]){
//                 cnt++;
//             }
//         }

//         return cnt;
//     }
// }