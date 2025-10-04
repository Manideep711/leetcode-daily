class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans=numBottles;
        int empty=numBottles;
        while(empty>=numExchange){
            int newBottles=1;
            ans+=newBottles;
            empty=empty-numExchange+newBottles;
            numExchange+=1;
        }
        return ans; 
    }
}