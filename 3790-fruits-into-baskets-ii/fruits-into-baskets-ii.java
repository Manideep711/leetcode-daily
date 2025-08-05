class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean placed[]=new boolean[fruits.length];
        int counter=0;
        for(int i=0;i<fruits.length;i++){
            int j=0;
            while(j<placed.length){
                if(baskets[j]>=fruits[i] && !placed[j]){
                    placed[j]=true;
                    counter++;
                    break;
                }
                j++;
            }
        }
        return fruits.length-counter;
    }
}