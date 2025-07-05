class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:arr){
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        int ans=Integer.MIN_VALUE;
        for(int x:hm.keySet()){
            if(x==hm.get(x)){
                ans=Math.max(ans,x);
            }
        }
        return ans==Integer.MIN_VALUE?-1:ans;
    }
}